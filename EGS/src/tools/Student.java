package tools;

public class Student {
    private String name;
    private String email;
    private String studentID;
    private String birthDate;
    private String department;
    private String counselor;
    private String hod;

    public Student(String name, String email, String studentID, String birthDate, String department, String counselor, String hod) {
        this.name = name;
        this.email = email;
        this.studentID = studentID;
        this.birthDate = birthDate;
        this.department = department;
        this.counselor = counselor;
        this.hod = hod;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getDepartment() {
        return department;
    }

    public String getCounselor() {
        return counselor;
    }

    public String getHoD() {
        return hod;
    }
}
