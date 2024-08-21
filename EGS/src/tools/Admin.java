package tools;

import java.util.ArrayList;
import java.util.List;

public class Admin {
    private String name;
    private String email;
    private String adminID;
    private String birthDate;
    private String password;

    public Admin(String name, String email, String adminID, String birthDate, String password) {
        this.name = name;
        this.email = email;
        this.adminID = adminID;
        this.birthDate = birthDate;
        this.password = password;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAdminID() {
        return adminID;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return String.format("%s---%s---%s---%s---%s", name, email, adminID, birthDate, password);
    }

    public static List<Admin> initializeAdmins() {
        List<Admin> admins = new ArrayList<>();
        admins.add(new Admin("Alice", "alice@example.com", "A001", "1985-01-15", "password123"));
        admins.add(new Admin("Bob", "bob@example.com", "A002", "1980-03-22", "password234"));
        admins.add(new Admin("Charlie", "charlie@example.com", "A003", "1979-07-11", "password345"));
        admins.add(new Admin("David", "david@example.com", "A004", "1988-05-09", "password456"));
        admins.add(new Admin("Eve", "eve@example.com", "A005", "1982-02-19", "password567"));
        admins.add(new Admin("Frank", "frank@example.com", "A006", "1975-09-01", "password678"));
        admins.add(new Admin("Grace", "grace@example.com", "A007", "1984-11-30", "password789"));
        admins.add(new Admin("Hank", "hank@example.com", "A008", "1989-08-18", "password890"));
        admins.add(new Admin("Ivy", "ivy@example.com", "A009", "1981-04-25", "password901"));
        admins.add(new Admin("Jack", "jack@example.com", "A010", "1978-12-03", "password012"));
        return admins;
    }
}
