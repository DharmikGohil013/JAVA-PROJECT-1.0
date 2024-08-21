package tools;

import java.util.Scanner;

public class StudentSection {
    private static Scanner scanner = new Scanner(System.in);

    public static void studentLogin() {
        System.out.print("Enter Student ID: ");
        String studentID = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Student student = validateStudent(studentID, password);

        if (student != null) {
            System.out.println("Login successful!");
            studentMenu(student);
        } else {
            System.out.println("Invalid ID or Password.");
        }
    }

    private static Student validateStudent(String studentID, String password) {
        for (Student student : DataInitializer.students) {
            if (student.getId().equals(studentID) && student.getPassword().equals(password)) {
                return student;
            }
        }
        return null;
    }

    private static void studentMenu(Student student) {
        int choice;
        do {
            System.out.println("\nStudent Menu:");
            System.out.println("1. View Profile");
            System.out.println("2. View Attendance");
            System.out.println("3. View Fees");
            System.out.println("4. View Results");
            System.out.println("5. View Class Updates");
            System.out.println("6. View Materials/Links");
            System.out.println("7. View Events");
            System.out.println("8. CR Section");
            System.out.println("9. Logout");
            System.out.println("10. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewProfile(student);
                    break;
                case 2:
                    viewAttendance(student);
                    break;
                case 3:
                    viewFees();
                    break;
                case 4:
                    viewResults(student);
                    break;
                case 5:
                    viewClassUpdates();
                    break;
                case 6:
                    viewMaterialsLinks();
                    break;
                case 7:
                    viewEvents();
                    break;
                case 8:
                    crSection(student);
                    break;
                case 9:
                    System.out.println("Logged out successfully.");
                    return;
                case 10:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 9);
    }

    private static void viewProfile(Student student) {
        System.out.println("\nProfile:");
        System.out.println("Name: " + student.getName());
        System.out.println("Email: " + student.getEmail());
        System.out.println("ID: " + student.getId());
        System.out.println("Birthdate: " + student.getBirthDate());
        System.out.println("Department: " + student.getDepartment());
        System.out.println("Counselor: " + student.getCounselor());
        System.out.println("HoD: " + student.getHod());
    }

    private static void viewAttendance(Student student) {
        // Logic to view attendance (not implemented here)
        System.out.println("Attendance details will be shown here.");
    }

    private static void viewFees() {
        System.out.println("Fees section is coming soon.");
        System.out.println("Press 0 to go back.");
        scanner.nextLine(); // Wait for user input
    }

    private static void viewResults(Student student) {
        // Logic to view results (not implemented here)
        System.out.println("Results will be shown here.");
    }

    private static void viewClassUpdates() {
        // Logic to view class updates (not implemented here)
        System.out.println("Class updates will be shown here.");
    }

    private static void viewMaterialsLinks() {
        // Logic to view materials/links (not implemented here)
        System.out.println("Materials/Links will be shown here.");
    }

    private static void viewEvents() {
        // Logic to view events (not implemented here)
        System.out.println("Events will be shown here.");
    }

    private static void crSection(Student student) {
        System.out.print("Enter CR Password (if applicable): ");
        String crPassword = scanner.nextLine();
        // Logic to validate CR password and show CR section (not implemented here)
        System.out.println("CR Section will be shown here.");
    }
}
