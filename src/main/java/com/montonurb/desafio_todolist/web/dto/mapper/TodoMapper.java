package com.montonurb.desafio_todolist.web.dto.mapper;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import com.montonurb.desafio_todolist.entity.Todo;
import com.montonurb.desafio_todolist.web.dto.TodoCreate;
import com.montonurb.desafio_todolist.web.dto.TodoResponse;

public class TodoMapper {
    public static Todo toTodo(TodoCreate todo) {
        return new ModelMapper().map(todo, Todo.class);
    }

    public static TodoResponse toDto(Todo todo) {
        return new ModelMapper().map(todo, TodoResponse.class);
    }

    public static List<TodoResponse> toList(List<Todo> todos) {
        return todos.stream().map(todo -> toDto(todo)).collect(Collectors.toList());
    }
}
