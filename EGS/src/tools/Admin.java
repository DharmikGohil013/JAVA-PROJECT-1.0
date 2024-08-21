package tools;

public class Admin extends Person {
    private String password;

    // Constructor
    public Admin(String name, String email, String id, String birthDate, String password) {
        super(name, email, id, birthDate);
        this.password = password;
    }

    // Getter and Setter methods
    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return String.format("Admin [Name=%s, Email=%s, ID=%s, BirthDate=%s]",
                             getName(), getEmail(), getId(), getBirthDate());
    }
}
