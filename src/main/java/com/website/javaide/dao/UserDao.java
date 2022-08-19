package com.website.javaide.dao;

import com.website.javaide.entity.LoginUser;
import com.website.javaide.entity.SignupUser;
import com.website.javaide.entity.UpdateUser;
import com.website.javaide.entity.User;

public interface UserDao {

    User getUser(LoginUser loginUser);
    void addUser(SignupUser signupUser);
    void updateUser(UpdateUser updateUser);
    void deleteUser(Long userId);
}
