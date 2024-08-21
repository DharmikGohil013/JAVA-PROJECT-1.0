package tools;

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
}
