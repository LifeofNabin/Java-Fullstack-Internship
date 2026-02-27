package org.example.fsinternship.dailytask.feb;

import java.sql.*;
import java.util.Scanner;

public class DailyTaskDAO {

    private static final String URL =
            "jdbc:mysql://127.0.0.1:3306/userdb?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "nepal";

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Register new user
    public boolean register(String username, String password) {
        String query = "INSERT INTO users (name, password) VALUES (?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username.trim());
            stmt.setString(2, password.trim());
            int rows = stmt.executeUpdate();
            return rows > 0;

        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("❌ User already exists.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Login
    public boolean login(String username, String password) {
        String query = "SELECT * FROM users WHERE name=? AND password=?";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, username.trim());
            stmt.setString(2, password.trim());

            ResultSet rs = stmt.executeQuery();
            return rs.next();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}