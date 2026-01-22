package com.emp.leavemanagement.config;

import java.sql.DriverManager;

/* 
    Database configuration class 
    to manage database connections.
*/

public class DBConfig {
    private static final String URL = "jdbc:postgresql://localhost:5432/leave_management";
    private static final String USER = "postgres";
    private static final String PASSWORD = "root";

    /* Returns a database connection */

    public static void main(String[] args) {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println("Connection failed");
            e.printStackTrace();
            return null;
        }
    }
}
