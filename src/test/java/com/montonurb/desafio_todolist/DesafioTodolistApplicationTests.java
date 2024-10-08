package com.montonurb.desafio_todolist;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.test.web.reactive.server.WebTestClient;

import com.montonurb.desafio_todolist.entity.Todo;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
class DesafioTodolistApplicationTests {
	@Autowired
	private WebTestClient webTestClient;

	@Test
	void testeCreateTodoSuccess() {
		var todo = new Todo("Estudar", "Estudar Spring Boot", false, 1);

		webTestClient
			.post()
			.uri("/todos")
			.bodyValue(todo)
			.exchange()
			.expectStatus().isOk()
			.expectBody()
			.jsonPath("$").isArray()
			.jsonPath("$.length()").isEqualTo(1)
			.jsonPath("$[0].title").isEqualTo(todo.getTitle())
			.jsonPath("$[0].description").isEqualTo(todo.getDescription())
			.jsonPath("$[0].completed").isEqualTo(todo.getCompleted())
			.jsonPath("$[0].priority").isEqualTo(todo.getPriority());
	}

	@Test
	void testeCreateTodoFailure() {
		webTestClient
			.post()
			.uri("/todos")
			.bodyValue(
				new Todo("", "", false, 0)
			).exchange()
			.expectStatus().isBadRequest();
	}
}
