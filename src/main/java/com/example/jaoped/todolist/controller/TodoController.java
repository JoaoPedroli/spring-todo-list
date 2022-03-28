package com.example.jaoped.todolist.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.example.jaoped.todolist.model.TodoItem;
import com.example.jaoped.todolist.repo.TodoRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {
  @Autowired
  private TodoRepo todoRepo;

  @GetMapping
  public List<TodoItem> findAll() {
    return todoRepo.findAll();
  }

  @PostMapping
  public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem) {
    return todoRepo.save(todoItem);
  }

  @PutMapping
  public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem) {
    return todoRepo.save(todoItem);
  }

  @PutMapping(value = "/complete/{id}")
  public TodoItem complete(@PathVariable Long id) {
    TodoItem todoItem = todoRepo.getById(id);
    todoItem.setDone(true);
    return todoRepo.save(todoItem);
  }

  @DeleteMapping(value = "/{id}")
  public void delete(@PathVariable Long id) {
    todoRepo.deleteById(id);
  }
}
