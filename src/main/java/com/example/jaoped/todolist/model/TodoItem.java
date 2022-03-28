package com.example.jaoped.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class TodoItem {

  private Long id;
  @NotBlank
  private String title;
  private boolean done;

  public TodoItem() {}

  public TodoItem(Long id, String title, boolean done) {
    this.id = id;
    this.title = title;
    this.done = done;
  }
  
  @Id
  @GeneratedValue
  public Long getId() {
    return this.id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public boolean getDone() {
    return this.done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }

}
