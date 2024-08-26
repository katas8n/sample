package com.example.model;

import java.io.Serializable;
public class TodoModel implements Serializable {
    private int id;
    private String title;
    private String description;
    private  boolean isCompleted;

    public TodoModel(int id, String title, String description, boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isCompleted = isCompleted;
    }

    public int getId() { return this.id; }
    public void setId(int id) {  this.id = id; }
    public String getTitle() { return this.title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return this.description; }
    public void setDescription(String description) { this.description = description; }
    public boolean getIsCompleted() { return this.isCompleted; }
    public void setIsCompleted(boolean isCompleted) { this.isCompleted = isCompleted; }

//    toString()
    @Override
    public String toString() {
        return this.id + ".)" + this.title + ", " + this.description + ", is completed:" + this.isCompleted;
    }
}
