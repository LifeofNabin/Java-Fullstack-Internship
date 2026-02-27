package org.example.fsinternship.dailytask.feb;

import java.util.Scanner;

public class Database {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DailyTaskDAO dao = new DailyTaskDAO();

        System.out.println("Do you want to (1) Register or (2) Login?");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        if (choice == 1) {
            if (dao.register(username, password)) {
                System.out.println("✅ Registration Successful!");
            } else {
                System.out.println("❌ Registration Failed.");
            }
        } else if (choice == 2) {
            if (dao.login(username, password)) {
                System.out.println("✅ Login Successful!");
            } else {
                System.out.println("❌ User not found. Please register.");
            }
        } else {
            System.out.println("❌ Invalid choice.");
        }
    }
}