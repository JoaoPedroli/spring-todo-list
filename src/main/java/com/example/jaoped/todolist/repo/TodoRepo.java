package com.example.jaoped.todolist.repo;

import com.example.jaoped.todolist.model.TodoItem;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepo extends JpaRepository<TodoItem, Long> {
  
}
