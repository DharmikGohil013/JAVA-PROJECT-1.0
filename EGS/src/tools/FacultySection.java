package tools;

import java.util.Scanner;

public class FacultySection {
    private static Scanner scanner = new Scanner(System.in);

    public static void facultyLogin() {
        System.out.print("Enter Faculty ID: ");
        String facultyID = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Faculty faculty = validateFaculty(facultyID, password);

        if (faculty != null) {
            System.out.println("Login successful!");
            facultyMenu(faculty);
        } else {
            System.out.println("Invalid ID or Password.");
        }
    }

    private static Faculty validateFaculty(String facultyID, String password) {
        for (Faculty faculty : DataInitializer.faculties) {
            if (faculty.getId().equals(facultyID) && faculty.getPassword().equals(password)) {
                return faculty;
            }
        }
        return null;
    }

    private static void facultyMenu(Faculty faculty) {
        int choice;
        do {
            System.out.println("\nFaculty Menu:");
            System.out.println("1. View Profile");
            System.out.println("2. View Salary");
            System.out.println("3. View All Student Details");
            System.out.println("4. View Attendance");
            System.out.println("5. View Attendance by Student ID");
            System.out.println("6. Add Materials/Links");
            System.out.println("7. Send Personal Message to Students");
            System.out.println("8. Logout");
            System.out.println("9. Exit");
            System.out.println("10. View Events");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    viewProfile(faculty);
                    break;
                case 2:
                    viewSalary(faculty);
                    break;
                case 3:
                    viewAllStudentDetails();
                    break;
                case 4:
                    viewAttendance(faculty);
                    break;
                case 5:
                    viewAttendanceByStudentID();
                    break;
                case 6:
                    addMaterialsLinks();
                    break;
                case 7:
                    sendPersonalMessageToStudents(faculty);
                    break;
                case 8:
                    System.out.println("Logged out successfully.");
                    return;
                case 9:
                    System.out.println("Exiting...");
                    System.exit(0);
                case 10:
                    viewEvents();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 8);
    }

    private static void viewProfile(Faculty faculty) {
        System.out.println("\nProfile:");
        System.out.println("Name: " + faculty.getName());
        System.out.println("Email: " + faculty.getEmail());
        System.out.println("ID: " + faculty.getId());
        System.out.println("Birthdate: " + faculty.getBirthDate());
        System.out.println("Department: " + faculty.getDepartment());
        System.out.println("Role: " + faculty.getRole());
    }

    private static void viewSalary(Faculty faculty) {
        // Logic to view salary (not implemented here)
        System.out.println("Salary details will be shown here.");
    }

    private static void viewAllStudentDetails() {
        System.out.println("No---Name---EmailID---ID---Birthdate---Department---Counselor---HoD---Password");
        int no = 1;
        for (Student student : DataInitializer.students) {
            System.out.printf("%d---%s---%s---%s---%s---%s---%s---%s---%s\n",
            no++,
            student.getName(),
            student.getEmail(),
            student.getId(),
            student.getBirthDate(),
            student.getDepartment(),
            student.getCounselor(),
            student.getHod(),
            student.getPassword());
}
}

private static void viewAttendance(Faculty faculty) {
// Logic to view attendance (not implemented here)
System.out.println("Attendance details will be shown here.");
}

private static void viewAttendanceByStudentID() {
System.out.print("Enter Student ID: ");
String studentID = scanner.nextLine();
// Logic to view attendance by student ID (not implemented here)
System.out.println("Attendance details for student ID " + studentID + " will be shown here.");
}

private static void addMaterialsLinks() {
System.out.print("Enter materials/links details: ");
String materialsLinksDetails = scanner.nextLine();
// Logic to store materials/links details (not implemented here)
System.out.println("Materials/Links added successfully!");
}

private static void sendPersonalMessageToStudents(Faculty faculty) {
System.out.print("Enter message: ");
String message = scanner.nextLine();
// Logic to send message to students (not implemented here)
System.out.println("Message sent successfully!");
}

private static void viewEvents() {
// Logic to view events (not implemented here)
System.out.println("Events will be shown here.");
}
}

