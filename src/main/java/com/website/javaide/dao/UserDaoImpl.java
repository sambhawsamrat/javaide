package com.website.javaide.dao;

import com.website.javaide.entity.LoginUser;
import com.website.javaide.entity.SignupUser;
import com.website.javaide.entity.UpdateUser;
import com.website.javaide.entity.User;
import com.website.javaide.jdbc.DatabaseConnection;

import java.sql.Connection;

public class UserDaoImpl implements UserDao {

    private Connection connection;

    public UserDaoImpl() {
        connection = DatabaseConnection.getInstance();
    }

    @Override
    public User getUser(LoginUser loginUser) {
        return null;
    }

    @Override
    public void addUser(SignupUser signupUser) {

    }

    @Override
    public void updateUser(UpdateUser updateUser) {

    }

    @Override
    public void deleteUser(Long userId) {

    }
}
