package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseController {

    public static Connection getConnection() {
        try {

            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/examen_practic", "root", "1234");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
