package com.website.javaide.controller;

import com.website.javaide.jdbc.DatabaseConnection;

import java.io.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet(name = "authenticationServlet", value = "/authentication")
public class AuthenticationServlet extends HttpServlet {

    private Connection connection;

    public void init() {
        connection = DatabaseConnection.getInstance();
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        String user = "aa";
        try {
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from user_table");
            while (resultSet.next()) {
                user = resultSet.getString("email");
            }
            resultSet.close();
            statement.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Hello " + user + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}