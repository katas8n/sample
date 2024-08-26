package com.example.controller;


import com.example.service.TodoService;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import java.io.IOException;
import java.util.List;


@WebServlet("/todos")
public class TodoController extends HttpServlet {
    private TodoService todoService = new TodoService();

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String action = req.getParameter("action");

        req.getRequestDispatcher("WEB-INF/view/...").forward(req, res);
    }
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        String action = req.getParameter("action");

        if(action.equals("post")) {

        }
    }
}
