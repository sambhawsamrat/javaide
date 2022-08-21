package com.website.javaide.service;

import com.website.javaide.pojo.LoginUser;
import com.website.javaide.pojo.SignupUser;
import com.website.javaide.pojo.UpdateUser;

public interface UserService {

    boolean checkUser(String email);
    boolean loginUser(LoginUser loginUser);
    void signupUser(SignupUser signupUser);
    void updateUser(UpdateUser updateUser);
    void deleteUser(Long userId);
}
