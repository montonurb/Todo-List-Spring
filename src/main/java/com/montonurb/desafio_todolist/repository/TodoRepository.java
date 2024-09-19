package com.montonurb.desafio_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.montonurb.desafio_todolist.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
