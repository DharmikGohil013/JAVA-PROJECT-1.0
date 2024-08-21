package tools;

import java.util.List;
import java.util.Scanner;

public class AdminSection {
    private static List<Admin> admins = Admin.initializeAdmins();
    private static Admin currentAdmin; // Track the currently logged-in admin

    public static void adminLogin() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Admin ID: ");
        String inputID = scanner.nextLine();
        
        System.out.print("Enter Password: ");
        String inputPassword = scanner.nextLine();
        
        boolean isAuthenticated = authenticate(inputID, inputPassword);
        
        if (isAuthenticated) {
            System.out.println("Login successful!");
            showAdminOptions();
        } else {
            System.out.println("Invalid Admin ID or Password.");
        }
    }

    private static boolean authenticate(String adminID, String password) {
        for (Admin admin : admins) {
            if (admin.getAdminID().equals(adminID) && admin.getPassword().equals(password)) {
                currentAdmin = admin; // Set the current admin after successful login
                return true;
            }
        }
        return false;
    }

    private static void showAdminOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Show All Admin Data");
            System.out.println("2. My Information");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    showAllAdminData();
                    break;
                case 2:
                    showMyInformation();
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    private static void showAllAdminData() {
        System.out.println("No---Name---Email ID---ID---Birthdate---Password");
        for (int i = 0; i < admins.size(); i++) {
            System.out.println((i + 1) + "---" + admins.get(i).toString());
        }
    }

    private static void showMyInformation() {
        clearScreen();
        if (currentAdmin != null) {
            System.out.println("My Information:");
            System.out.println("Name: " + currentAdmin.getName());
            System.out.println("Email ID: " + currentAdmin.getEmail());
            System.out.println("Admin ID: " + currentAdmin.getAdminID());
            System.out.println("Birthdate: " + currentAdmin.getBirthDate());
            System.out.println();
            System.out.print("Press 0 to go back: ");
            Scanner scanner = new Scanner(System.in);
            int back = scanner.nextInt();
            if (back == 0) {
                clearScreen();
                showAdminOptions();
            }
        }
    }

    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
