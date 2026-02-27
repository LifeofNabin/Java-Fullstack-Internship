package org.example.fsinternship.dailytask.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDAO {

    // Database connection details
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/userdb?allowPublicKeyRetrieval=true&useSSL=false";
    private static final String USER = "root";
    private static final String PASSWORD = "nepal";

    // Get database connection
    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    // Check if employee exists
    public boolean checkIfExists(String name) {
        String query = "SELECT * FROM employees WHERE name = ?";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {

            stmt.setString(1, name);
            ResultSet rs = stmt.executeQuery();

            return rs.next(); // true if a row exists

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // default if error
    }

    // Add a new employee
    public boolean addEmployee(String name, String department, String manager) {

        if (checkIfExists(name)) {
            System.out.println("❌ Employee already exists!");
            return false;
        }

        String insertQuery = "INSERT INTO employees (name, department, manager, joindate) VALUES (?, ?, ?, CURRENT_DATE)";

        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(insertQuery)) {

            stmt.setString(1, name);
            stmt.setString(2, department);
            stmt.setString(3, manager);

            int rowsAffected = stmt.executeUpdate();

            return rowsAffected > 0; // true if insertion successful

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}