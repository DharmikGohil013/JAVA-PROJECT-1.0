package tools;

public class Faculty extends Person {
    private String department;
    private String role;
    private String password;

    // Constructor
    public Faculty(String name, String email, String id, String birthDate, String department, String role, String password) {
        super(name, email, id, birthDate);
        this.department = department;
        this.role = role;
        this.password = password;
    }

    // Getter and Setter methods
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return String.format("Faculty [Name=%s, Email=%s, ID=%s, BirthDate=%s, Department=%s, Role=%s]",
                             getName(), getEmail(), getId(), getBirthDate(), department, role);
    }
}
