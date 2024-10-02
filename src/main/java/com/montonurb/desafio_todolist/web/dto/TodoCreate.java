package com.montonurb.desafio_todolist.web.dto;

import jakarta.validation.constraints.NotBlank;

public class TodoCreate {
    @NotBlank
    private String title;
    private String description;
    private boolean completed;
    private int priority;
    
    public TodoCreate() {}
    
    public TodoCreate(@NotBlank String title, String description, boolean completed, int priority) {
        this.title = title;
        this.description = description;
        this.completed = completed;
        this.priority = priority;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
}
