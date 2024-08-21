package tools;

import java.util.ArrayList;

public class DataInitializer {
    public static ArrayList<Faculty> faculties = new ArrayList<>();
    public static ArrayList<Student> students = new ArrayList<>();

    public static void initializeAdmins(ArrayList<Admin> admins) {
        admins.add(new Admin("Admin 1", "admin1@example.com", "A001", "01/01/1980", "password1"));
        admins.add(new Admin("Admin 2", "admin2@example.com", "A002", "02/02/1981", "password2"));
        admins.add(new Admin("Admin 3", "admin3@example.com", "A003", "03/03/1982", "password3"));
        admins.add(new Admin("Admin 4", "admin4@example.com", "A004", "04/04/1983", "password4"));
        admins.add(new Admin("Admin 5", "admin5@example.com", "A005", "05/05/1984", "password5"));
        admins.add(new Admin("Admin 6", "admin6@example.com", "A006", "06/06/1985", "password6"));
        admins.add(new Admin("Admin 7", "admin7@example.com", "A007", "07/07/1986", "password7"));
        admins.add(new Admin("Admin 8", "admin8@example.com", "A008", "08/08/1987", "password8"));
        admins.add(new Admin("Admin 9", "admin9@example.com", "A009", "09/09/1988", "password9"));
        admins.add(new Admin("Admin 10", "admin10@example.com", "A010", "10/10/1989", "password10"));
    }

    public static void initializeFaculty(ArrayList<Faculty> faculties) {
        faculties.add(new Faculty("Faculty 1", "faculty1@example.com", "F001", "01/01/1970", "IT", "HoD"));
        faculties.add(new Faculty("Faculty 2", "faculty2@example.com", "F002", "02/02/1971", "CE", "HoD"));
        faculties.add(new Faculty("Faculty 3", "faculty3@example.com", "F003", "03/03/1972", "CS", "HoD"));
        faculties.add(new Faculty("Faculty 4", "faculty4@example.com", "F004", "04/04/1973", "EC", "HoD"));
        faculties.add(new Faculty("Faculty 5", "faculty5@example.com", "F005", "05/05/1974", "CD", "HoD"));
        faculties.add(new Faculty("Faculty 6", "faculty6@example.com", "F006", "06/06/1975", "IT", "Counselor"));
        faculties.add(new Faculty("Faculty 7", "faculty7@example.com", "F007", "07/07/1976", "CE", "Counselor"));
        faculties.add(new Faculty("Faculty 8", "faculty8@example.com", "F008", "08/08/1977", "CS", "Counselor"));
        faculties.add(new Faculty("Faculty 9", "faculty9@example.com", "F009", "09/09/1978", "EC", "Counselor"));
        faculties.add(new Faculty("Faculty 10", "faculty10@example.com", "F010", "10/10/1979", "CD", "Counselor"));
        faculties.add(new Faculty("Faculty 11", "faculty11@example.com", "F011", "11/11/1980", "IT", "Counselor"));
        faculties.add(new Faculty("Faculty 12", "faculty12@example.com", "F012", "12/12/1981", "CE", "Counselor"));
        faculties.add(new Faculty("Faculty 13", "faculty13@example.com", "F013", "13/01/1982", "CS", "Counselor"));
        faculties.add(new Faculty("Faculty 14", "faculty14@example.com", "F014", "14/02/1983", "EC", "Counselor"));
        faculties.add(new Faculty("Faculty 15", "faculty15@example.com", "F015", "15/03/1984", "CD", "Counselor"));
        faculties.add(new Faculty("Faculty 16", "faculty16@example.com", "F016", "16/04/1985", "IT", "Counselor"));
        faculties.add(new Faculty("Faculty 17", "faculty17@example.com", "F017", "17/05/1986", "CE", "Counselor"));
        faculties.add(new Faculty("Faculty 18", "faculty18@example.com", "F018", "18/06/1987", "CS", "Counselor"));
        faculties.add(new Faculty("Faculty 19", "faculty19@example.com", "F019", "19/07/1988", "EC", "Counselor"));
        faculties.add(new Faculty("Faculty 20", "faculty20@example.com", "F020", "20/08/1989", "CD", "Principal"));

        // Adding to the global faculties list
        DataInitializer.faculties.addAll(faculties);
    }

    public static void initializeStudents(ArrayList<Student> students) {
        String[] departments = {"IT", "CE", "CS", "EC", "CD"};
        for (int i = 1; i <= 200; i++) {
            String name = "Student " + i;
            String email = "student" + i + "@example.com";
            String studentID = "S" + String.format("%03d", i);
            String birthDate = String.format("%02d/%02d/2000", i % 30 + 1, i % 12 + 1);
            String department = departments[i % 5];
            Faculty counselor = faculties.get((i - 1) % 20);
            Faculty hod = faculties.get((i - 1) % 5);
            students.add(new Student(name, email, studentID, birthDate, department, counselor.getName(), hod.getName()));
        }

        // Adding to the global students list
        DataInitializer.students.addAll(students);
    }
}
