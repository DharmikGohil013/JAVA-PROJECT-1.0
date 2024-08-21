package tools;

import java.util.ArrayList;
import java.util.List;

public class DataInitializer {
    public static List<Admin> admins = new ArrayList<>();
    public static List<Faculty> faculties = new ArrayList<>();
    public static List<Student> students = new ArrayList<>();

    static {
        // Example admins
        admins.add(new Admin("Admin1", "admin1@example.com", "A001", "01-01-1980", "adminpass1"));
        admins.add(new Admin("Admin2", "admin2@example.com", "A002", "02-02-1981", "adminpass2"));

        // Example faculties
        faculties.add(new Faculty("Faculty1", "faculty1@example.com", "F001", "01-01-1975", "IT", "Professor", "facultyPass1"));
        faculties.add(new Faculty("Faculty2", "faculty2@example.com", "F002", "02-02-1976", "CE", "Associate Professor", "facultyPass2"));

        // Example students
        students.add(new Student("Student1", "student1@example.com", "S001", "01-01-2000", "IT", "Faculty1", "Head1", "studentPass1"));
        students.add(new Student("Student2", "student2@example.com", "S002", "02-02-2001", "CE", "Faculty2", "Head2", "studentPass2"));
    }
}
