package com.example.service;

import com.example.dao.TodoDAO;
import com.example.model.TodoModel;
import com.sun.tools.javac.comp.Todo;

import java.io.IOException;
import java.util.List;

public class TodoService {
    private TodoDAO todoDAO = new TodoDAO();

    public void create(TodoModel todoModel) throws IOException {
        todoDAO.create(todoModel);
    }

    public void update(TodoModel todoModel) throws IOException {
        todoDAO.updateTodos(todoModel);
    }
    public List<TodoModel> allTodos(TodoModel todoModel) throws IOException {
        return todoDAO.allTodos();
    }

    public void findById(TodoModel todoModel) throws IOException {
        todoDAO.findById(todoModel.getId());
    }
}
