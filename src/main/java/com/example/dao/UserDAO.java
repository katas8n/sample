package com.example.dao;

import com.example.model.UserModel;

import java.sql.*;

public class UserDAO {
    private static final String INSERT_USER_TO_DB = "INSERT INTO user(username, password, email) VALUES (?, ?, ?) ";
    private static final String SELECT_USER_FROM_DB = "SELECT * FROM user";
//  TODO  private static final String FILTER_USER_FROM_DB = "";
//    private static final String GROUP_USER_FROM_DB = "";
//    private static final String SORT_USER_FROM_DB = "";

    public void insertUserToDb(UserModel user) {
//        Connection connection = DriverManager.getConnection();
    }
}
