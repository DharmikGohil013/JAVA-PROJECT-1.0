package tools;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminSection {
    private static ArrayList<Admin> admins = new ArrayList<>();
    private static ArrayList<Faculty> faculties = DataInitializer.faculties; // Assuming you have this initialized
    private static ArrayList<Student> students = DataInitializer.students; // Assuming you have this initialized
    private static Admin currentAdmin;

    static {
        DataInitializer.initializeAdmins(admins);
        DataInitializer.initializeFaculty(faculties);
        DataInitializer.initializeStudents(students);
    }

    public static void adminLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin ID: ");
        String adminID = scanner.nextLine();
        System.out.print("Enter Password: ");
        String password = scanner.nextLine();

        for (Admin admin : admins) {
            if (admin.getAdminID().equals(adminID) && admin.getPassword().equals(password)) {
                currentAdmin = admin;
                showAdminOptions();
                return;
            }
        }
        System.out.println("Invalid Admin ID or Password.");
    }

    private static void showAdminOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Admin Options:");
            System.out.println("1. Show All Admin Data");
            System.out.println("2. My Information");
            System.out.println("3. Show All Faculty Data");
            System.out.println("4. Show All Student Data");
            System.out.println("0. Logout");
    
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            switch (choice) {
                case 1:
                    showAllAdminData();
                    break;
                case 2:
                    showMyInformation();
                    break;
                case 3:
                    showAllFacultyData();
                    break;
                case 4:
                    showAllStudentData(); // Ensure this is only called once
                    break;
                case 0:
                    System.out.println("Logging out...");
                    currentAdmin = null;
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }    
    private static void showAllAdminData() {
        System.out.println("No---Name---Email ID---ID---Birthdate---Password");
        for (int i = 0; i < admins.size(); i++) {
            Admin admin = admins.get(i);
            System.out.println((i + 1) + "---" + admin.getName() + "---" + admin.getEmail() + "---" +
                               admin.getAdminID() + "---" + admin.getBirthDate() + "---" + admin.getPassword());
        }
    }

    private static void showMyInformation() {
        if (currentAdmin != null) {
            System.out.println("Name: " + currentAdmin.getName());
            System.out.println("Email ID: " + currentAdmin.getEmail());
            System.out.println("ID: " + currentAdmin.getAdminID());
            System.out.println("Birthdate: " + currentAdmin.getBirthDate());
            System.out.println("Press 0 to go back");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            if (choice == 0) {
                showAdminOptions();
            }
        } else {
            System.out.println("No admin is currently logged in.");
        }
    }

    private static void showAllStudentData() {
        System.out.println("No---Name---Email ID---ID---Birthdate---Department---Counselor---HoD");
        for (int i = 0; i < 200; i++) {
            Student student = students.get(i);
            System.out.println((i + 1) + "---" + student.getName() + "---" + student.getEmail() + "---" +
                               student.getStudentID() + "---" + student.getBirthDate() + "---" +
                               student.getDepartment() + "---" + student.getCounselor() + "---" + student.getHoD());
        }
    }    
    private static void showAllFacultyData() {
        System.out.println("No---Name---Email ID---ID---Birthdate---Department---Role");
        for (int i = 0; i < 20; i++) {
            Faculty faculty = faculties.get(i);
            System.out.println((i + 1) + "---" + faculty.getName() + "---" + faculty.getEmail() + "---" +
                               faculty.getFacultyID() + "---" + faculty.getBirthDate() + "---" +
                               faculty.getDepartment() + "---" + faculty.getRole());
        }
    }
}
