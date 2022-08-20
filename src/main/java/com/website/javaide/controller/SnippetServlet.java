package com.website.javaide.controller;

import org.apache.commons.lang3.RandomStringUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "SnippetServlet", value = "/SnippetServlet")
public class SnippetServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private String getRandomHash() {
        return RandomStringUtils.randomAlphanumeric(30) + System.currentTimeMillis();
    }
}
