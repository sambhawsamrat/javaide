package com.website.javaide.controller;

import com.website.javaide.constants.FormType;
import com.website.javaide.pojo.LoginUser;
import com.website.javaide.service.UserService;
import com.website.javaide.service.UserServiceImpl;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "UserServlet", value = "/user")
public class UserServlet extends HttpServlet {

    private UserService userService;

    @Override
    public void init() throws ServletException {
        userService = new UserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String logout = req.getParameter("logout");

        if(logout != null) {
            req.getSession().invalidate();
            resp.sendRedirect(req.getServletContext().getContextPath());
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int formType = Integer.parseInt(req.getParameter("form-type"));

        if(formType == FormType.LOGIN_USER) {
            String email = req.getParameter("email");
            String password = req.getParameter("password");

            if(userService.checkUser(email)) {
                LoginUser loginUser = new LoginUser(email, password);

                if(userService.loginUser(loginUser)) {
                    // TODO: Set session and redirect to editor.
                } else {
                    // TODO: Redirect to login page with error message.
                }
            } else {
                // TODO: No such user.
            }
        } else if(formType == FormType.SIGNUP_USER) {
            // TODO:
        }
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}