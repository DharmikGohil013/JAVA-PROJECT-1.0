package tools;

public class Faculty {
    private String name;
    private String email;
    private String facultyID;
    private String birthDate;
    private String department;
    private String role;

    public Faculty(String name, String email, String facultyID, String birthDate, String department, String role) {
        this.name = name;
        this.email = email;
        this.facultyID = facultyID;
        this.birthDate = birthDate;
        this.department = department;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getFacultyID() {
        return facultyID;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getRole() {
        return role;
    }
}
