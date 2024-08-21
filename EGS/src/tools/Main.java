package tools;
import tools.Student;
import tools.Faculty;
import tools.Admin;
import tools.DataInitializer;
import java.util.Scanner;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    public static void showMenu() {
        while (true) {
            System.out.println("Welcome to the E-Governance System");
            System.out.println("Please select an option:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Faculty");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            
            // Error Handling Example
            int choice = 0;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the buffer
                continue; // Return to the start of the loop
            }

            switch (choice) {
                case 1:
                    AdminSection.adminLogin();
                    break;
                case 2:
                    StudentSection.studentLogin();
                    break;
                case 3:
                    FacultySection.facultyLogin();
                    break;
                case 4:
                    System.out.println("Exiting the system. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
