package tools;

import java.util.Scanner;

public class AdminSection {
    private static Scanner scanner = new Scanner(System.in);

    public static void adminLogin() {
        System.out.print("Enter Admin ID: ");
        String adminID = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Admin admin = validateAdmin(adminID, password);

        if (admin != null) {
            System.out.println("Login successful!");
            adminMenu(admin);
        } else {
            System.out.println("Invalid ID or Password.");
        }
    }

    private static Admin validateAdmin(String adminID, String password) {
        for (Admin admin : DataInitializer.admins) {
            if (admin.getId().equals(adminID) && admin.getPassword().equals(password)) {
                return admin;
            }
        }
        return null;
    }

    private static void adminMenu(Admin admin) {
        int choice;
        do {
            System.out.println("\nAdmin Menu:");
            System.out.println("1. View All Admin Details");
            System.out.println("2. View Personal Details");
            System.out.println("3. View All Student Details");
            System.out.println("4. View All Faculty Details");
            System.out.println("5. Update Student Details");
            System.out.println("6. Update Faculty Details");
            System.out.println("7. Add New Faculty");
            System.out.println("8. Add New Student");
            System.out.println("9. Add Events");
            System.out.println("10. Add University Updates");
            System.out.println("11. Logout");
            System.out.println("12. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    viewAllAdminDetails();
                    break;
                case 2:
                    viewPersonalDetails(admin);
                    break;
                case 3:
                    viewAllStudentDetails();
                    break;
                case 4:
                    viewAllFacultyDetails();
                    break;
                case 5:
                    updateStudentDetails();
                    break;
                case 6:
                    updateFacultyDetails();
                    break;
                case 7:
                    addNewFaculty();
                    break;
                case 8:
                    addNewStudent();
                    break;
                case 9:
                    addEvents();
                    break;
                case 10:
                    addUniversityUpdates();
                    break;
                case 11:
                    System.out.println("Logged out successfully.");
                    return;
                case 12:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 11);
    }

    private static void viewAllAdminDetails() {
        System.out.println("No---Name---EmailID---ID---Birthdate---Password");
        int no = 1;
        for (Admin admin : DataInitializer.admins) {
            System.out.printf("%d---%s---%s---%s---%s---%s\n",
                    no++,
                    admin.getName(),
                    admin.getEmail(),
                    admin.getId(),
                    admin.getBirthDate(),
                    admin.getPassword());
        }
    }

    private static void viewPersonalDetails(Admin admin) {
        System.out.println("\nPersonal Details:");
        System.out.println("Name: " + admin.getName());
        System.out.println("Email: " + admin.getEmail());
        System.out.println("ID: " + admin.getId());
        System.out.println("Birthdate: " + admin.getBirthDate());
        System.out.println("Password: " + admin.getPassword());
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

    private static void viewAllFacultyDetails() {
        System.out.println("No---Name---EmailID---ID---Birthdate---Department---Role---Password");
        int no = 1;
        for (Faculty faculty : DataInitializer.faculties) {
            System.out.printf("%d---%s---%s---%s---%s---%s---%s---%s\n",
                    no++,
                    faculty.getName(),
                    faculty.getEmail(),
                    faculty.getId(),
                    faculty.getBirthDate(),
                    faculty.getDepartment(),
                    faculty.getRole(),
                    faculty.getPassword());
        }
    }

    private static void updateStudentDetails() {
        // Logic to update student details (not implemented here)
        System.out.println("Update student details functionality not implemented.");
    }

    private static void updateFacultyDetails() {
        // Logic to update faculty details (not implemented here)
        System.out.println("Update faculty details functionality not implemented.");
    }

    private static void addNewFaculty() {
        System.out.print("Enter Faculty Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Faculty Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Faculty ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Birthdate: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Role: ");
        String role = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Faculty newFaculty = new Faculty(name, email, id, birthDate, department, role, password);
        DataInitializer.faculties.add(newFaculty);
        System.out.println("New faculty added successfully!");
    }

    private static void addNewStudent() {
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Student Email: ");
        String email = scanner.nextLine();
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Birthdate: ");
        String birthDate = scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        System.out.print("Enter Counselor: ");
        String counselor = scanner.nextLine();
        System.out.print("Enter HoD: ");
        String hod = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        Student newStudent = new Student(name, email, id, birthDate, department, counselor, hod, password);
        DataInitializer.students.add(newStudent);
        System.out.println("New student added successfully!");
    }

    private static void addEvents() {
        System.out.print("Enter Event Details: ");
        String eventDetails = scanner.nextLine();
        // Logic to store event details (not implemented here)
        System.out.println("Event added successfully!");
    }

    private static void addUniversityUpdates() {
        System.out.print("Enter University Update Details: ");
        String updateDetails = scanner.nextLine();
        // Logic to store university updates (not implemented here)
        System.out.println("University update added successfully!");
    }
}
