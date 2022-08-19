package com.website.javaide.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private final String USR = "root";
    private final String PWD = "12345";
    private final String CLS = "com.mysql.cj.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/java_ide?autoReconnect=true&useSSL=false";

    private final static Connection connection = new DatabaseConnection().createConnection();

    private Connection createConnection() {
        Connection link;
        try {
            Class.forName(CLS);
            link = DriverManager.getConnection(URL, USR, PWD);
        } catch(ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            link = null;
        }
        return link;
    }

    public static Connection getInstance() {
        return connection;
    }
}
