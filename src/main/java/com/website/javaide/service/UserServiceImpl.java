package com.website.javaide.service;

import com.website.javaide.constants.UpdateType;
import com.website.javaide.dao.UserDao;
import com.website.javaide.dao.UserDaoImpl;
import com.website.javaide.entity.User;
import com.website.javaide.pojo.LoginUser;
import com.website.javaide.pojo.SignupUser;
import com.website.javaide.pojo.UpdateUser;
import org.mindrot.jbcrypt.BCrypt;

public class UserServiceImpl implements UserService {
    private final UserDao userDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    @Override
    public boolean checkUser(String email) {
        return userDao.getUser(email) != null;
    }

    @Override
    public boolean loginUser(LoginUser loginUser) {
        User user = userDao.getUser(loginUser);
        return BCrypt.checkpw(loginUser.getPassword(), user.getPassword());
    }

    @Override
    public void signupUser(SignupUser signupUser) {
        String hashedPassword = BCrypt.hashpw(signupUser.getPassword(), BCrypt.gensalt(12));
        signupUser.setPassword(hashedPassword);
        userDao.addUser(signupUser);
    }

    @Override
    public void updateUser(UpdateUser updateUser) {
        if(updateUser.getUpdateType() == UpdateType.PASSWORD) {
            String hashedPassword = BCrypt.hashpw(updateUser.getPassword(), BCrypt.gensalt(12));
            updateUser.setPassword(hashedPassword);
        }
        userDao.updateUser(updateUser);
    }

    @Override
    public void deleteUser(Long userId) {
        userDao.deleteUser(userId);
    }
}
