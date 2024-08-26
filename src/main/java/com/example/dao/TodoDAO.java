package com.example.dao;

import com.example.model.TodoModel;
import com.example.utils.TodoUtil;

import java.io.*;
import java.io.IOException;

import java.util.List;
import java.util.ArrayList;

public class TodoDAO {
    private static final String FILE_PATH = "history.txt";

    public void create(TodoModel todoModel) throws IOException {
        List<TodoModel> todos = this.allTodos();
        todos.add(todoModel);

        //     TODO:   Write file
    }

    public List<TodoModel> allTodos() throws IOException {
        File file = new File(this.FILE_PATH);
        ArrayList<TodoModel> todos = new ArrayList<TodoModel>();

        if(!file.exists()) { return todos; }

        BufferedReader reader = new BufferedReader(new FileReader(file));

        String chunk;

        while ((chunk = reader.readLine()) != null) {
            System.out.println(chunk);
            // TODO: split data from file and then put it into the todos array
        }

        return todos;
    }

    public void updateTodos(TodoModel updatedTodosModel) throws IOException {
        List<TodoModel> todos = this.allTodos();

        for(int i = 0; i < todos.size(); i++) {
            if(todos.get(i).getId() == updatedTodosModel.getId()) {
                todos.set(i, updatedTodosModel);
            }
        }
    }

    public void findById(int id) throws IOException {
        List<TodoModel> todos = this.allTodos();
        todos.stream().filter(todo -> todo.getId() == id).findFirst();
    }
}
