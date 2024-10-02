package com.montonurb.desafio_todolist.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.montonurb.desafio_todolist.entity.Todo;
import com.montonurb.desafio_todolist.service.TodoService;
import com.montonurb.desafio_todolist.web.dto.TodoResponse;
import com.montonurb.desafio_todolist.web.dto.mapper.TodoMapper;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/todos")
public class TodoController {
    TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @Operation(summary = "Criar um ToDo.", description = "Enviando os dados para criação de um Todo.")
    @PostMapping
    public ResponseEntity<List<TodoResponse>> create(@RequestBody @Valid Todo todo) {
        return ResponseEntity.ok(TodoMapper.toList(todoService.create(todo)));
    }

    @Operation(summary = "Listar os ToDos.", description = "Recuperando toda a lista com os ToDos.")
    @GetMapping
    public ResponseEntity<List<TodoResponse>> list() {
        return ResponseEntity.ok(TodoMapper.toList(todoService.list()));
    }

    @Operation(summary = "Atualizar um ToDo.", description = "Como atualizar os dados de um Todo.")
    @PutMapping
    public ResponseEntity<List<TodoResponse>> update(@RequestBody Todo todo) {
        return ResponseEntity.ok(TodoMapper.toList(todoService.update(todo)));
    }

    @Operation(summary = "Apagar um ToDo.", description = "Como apagar um Todo passando o ID dele.")
    @DeleteMapping("{id}")
    public ResponseEntity<List<TodoResponse>> delete(@PathVariable("id") Long id) {
        return ResponseEntity.ok(TodoMapper.toList(todoService.delete(id)));
    }
}
