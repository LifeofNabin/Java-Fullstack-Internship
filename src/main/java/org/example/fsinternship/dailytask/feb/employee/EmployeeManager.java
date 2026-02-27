package org.example.fsinternship.dailytask.employee;

import java.util.Scanner;

public class EmployeeManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        org.example.fsinternship.dailytask.employee.EmployeeDAO dao = new org.example.fsinternship.dailytask.employee.EmployeeDAO();

        System.out.println("=== Employee Registration ===");

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter department: ");
        String department = sc.nextLine();

        System.out.print("Enter manager: ");
        String manager = sc.nextLine();

        // Add employee
        boolean added = dao.addEmployee(name, department, manager);

        if (added) {
            System.out.println("✅ Employee added successfully!");
        } else {
            System.out.println("❌ Could not add employee.");
        }

        sc.close();
    }
}