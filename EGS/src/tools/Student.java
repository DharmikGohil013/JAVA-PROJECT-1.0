package tools;

public class Student extends Person {
    private String department;
    private String counselor;
    private String hod;
    private String password;

    // Constructor
    public Student(String name, String email, String id, String birthDate, String department, String counselor, String hod, String password) {
        super(name, email, id, birthDate);
        this.department = department;
        this.counselor = counselor;
        this.hod = hod;
        this.password = password;
    }

    // Getter and Setter methods
    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getCounselor() { return counselor; }
    public void setCounselor(String counselor) { this.counselor = counselor; }

    public String getHod() { return hod; }
    public void setHod(String hod) { this.hod = hod; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    @Override
    public String toString() {
        return String.format("Student [Name=%s, Email=%s, ID=%s, BirthDate=%s, Department=%s, Counselor=%s, HoD=%s]",
                             getName(), getEmail(), getId(), getBirthDate(), department, counselor, hod);
    }
}
