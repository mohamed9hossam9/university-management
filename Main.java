package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        System.out.println("Hello world!");

        LoginSystem loginSystem = new LoginSystem();

        // Add users to the system
        loginSystem.addUser("user1", "password1");
        loginSystem.addUser("user2", "password2");

        // Check login credentials
        System.out.println("Login result for user1: " + loginSystem.isValidUser("user1", "password1")); // true
        System.out.println("Login result for user2: " + loginSystem.isValidUser("user2", "wrongpassword")); // false

    */
        Scanner scanner = new Scanner(System.in);

        int userType;

        while (true) {
            boolean escapeWhile=false;
            System.out.println("Select user type:");
            System.out.println("1. Admin");
            System.out.println("2. Professor");
            System.out.println("3. Student");
            System.out.println("4. Exit");


            userType = scanner.nextInt();
            scanner.nextLine();

            switch (userType) {
                case 1:
                    System.out.println("You selected Admin.");
                    System.out.println("enter your username");

                    String adminName = scanner.nextLine();
                    String rightAdminName ="mohamed hossam";
                    if (rightAdminName == adminName) {
//                        userName
                    }

                    // Add admin-related code here
                    break;
                case 2:
                    System.out.println("You selected Professor.");
                    // Add professor-related code here
                    break;
                case 3:
                    System.out.println("You selected Student.");
                    // Add student-related code here
                    break;
                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    escapeWhile= true;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, or 4.");
            }
            if (escapeWhile) break;
        }



    }
}