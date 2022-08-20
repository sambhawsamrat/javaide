package com.website.javaide.dao;

import com.website.javaide.pojo.LoginUser;
import com.website.javaide.pojo.SignupUser;
import com.website.javaide.pojo.UpdateUser;
import com.website.javaide.entity.User;

public interface UserDao {

    User getUser(String email);
    User getUser(LoginUser loginUser);
    void addUser(SignupUser signupUser);
    void updateUser(UpdateUser updateUser);
    void deleteUser(Long userId);
}
