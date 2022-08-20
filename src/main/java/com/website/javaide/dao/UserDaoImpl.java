package com.website.javaide.dao;

import com.website.javaide.entity.LoginUser;
import com.website.javaide.entity.SignupUser;
import com.website.javaide.entity.UpdateUser;
import com.website.javaide.entity.User;
import com.website.javaide.jdbc.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private Connection connection;

    public UserDaoImpl() {
        connection = DatabaseConnection.getInstance();
    }

    @Override
    public User getUser(LoginUser loginUser) {
        String query = "SELECT userId, email, password, verified FROM user_table WHERE email=? and password=?";
        try{
            PreparedStatement stmt = connection.prepareStatement(query);
            stmt.setString(1, loginUser.getEmail());
            stmt.setString(2, loginUser.getPassword());
            ResultSet result = stmt.executeQuery();

            String db_username = "";
            String db_password = "";

            while (result.next()) {
                db_username = result.getString("username");
                db_password = result.getString("password");
            }
            stmt.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

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
