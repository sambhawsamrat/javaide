package com.website.javaide.dao;

import com.website.javaide.constants.UpdateType;
import com.website.javaide.pojo.LoginUser;
import com.website.javaide.pojo.SignupUser;
import com.website.javaide.pojo.UpdateUser;
import com.website.javaide.entity.User;
import com.website.javaide.jdbc.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao {

    private final Connection connection;

    public UserDaoImpl() {
        connection = DatabaseConnection.getInstance();
    }

    @Override
    public User getUser(String email) {
        User user = null;
        PreparedStatement stmt = null;
        String query = "SELECT * FROM `user_table` WHERE `email`=?";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, email);
            ResultSet result = stmt.executeQuery();

            while (result.next()) {
                user = new User(result.getLong("userid"));
                user.setEmail(email);
                user.setName(result.getString("name"));
                user.setPassword(result.getString("password"));
                user.setVerified(result.getInt("verified"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }

        return user;
    }

    @Override
    public User getUser(LoginUser loginUser) {
        return getUser(loginUser.getEmail());
    }

    @Override
    public void addUser(SignupUser signupUser) {
        PreparedStatement stmt = null;
        String query = "INSERT INTO `user_table` (`name`, `email`, `password`) VALUES(?, ?, ?)";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setString(1, signupUser.getName());
            stmt.setString(2, signupUser.getEmail());
            stmt.setString(3, signupUser.getPassword());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    @Override
    public void updateUser(UpdateUser updateUser) {
        String query = null;
        PreparedStatement stmt = null;

        try {
            switch(updateUser.getUpdateType()) {
                case UpdateType.NAME:
                    query = "UPDATE `user_table` SET `name`=? WHERE `userid`=?";
                    stmt = connection.prepareStatement(query);
                    stmt.setString(1, updateUser.getName());
                    stmt.setLong(2, updateUser.getUserId());
                    stmt.executeUpdate();
                    break;
                case UpdateType.EMAIL:
                    query = "UPDATE `user_table` SET `email`=? WHERE `userid`=?";
                    stmt = connection.prepareStatement(query);
                    stmt.setString(1, updateUser.getEmail());
                    stmt.setLong(2, updateUser.getUserId());
                    stmt.executeUpdate();
                    break;
                case UpdateType.PASSWORD:
                    query = "UPDATE `user_table` SET `password`=? WHERE `userid`=?";
                    stmt = connection.prepareStatement(query);
                    stmt.setString(1, updateUser.getPassword());
                    stmt.setLong(2, updateUser.getUserId());
                    stmt.executeUpdate();
                    break;
                case UpdateType.VERIFIED:
                    query = "UPDATE `user_table` SET `verified`=? WHERE `email`=?";
                    stmt = connection.prepareStatement(query);
                    stmt.setInt(1, updateUser.getVerified());
                    stmt.setString(2, updateUser.getEmail());
                    stmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    @Override
    public void deleteUser(Long userId) {
        PreparedStatement stmt = null;
        String query = "DELETE FROM `user_table` WHERE `userid`=? LIMIT 1";

        try {
            stmt = connection.prepareStatement(query);
            stmt.setLong(1, userId);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close(stmt);
        }
    }

    private void close(PreparedStatement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
