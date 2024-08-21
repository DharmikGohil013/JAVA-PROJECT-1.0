package tools;

public class Person {
    protected String name;
    protected String email;
    protected String id;
    protected String birthDate;

    // Constructor
    public Person(String name, String email, String id, String birthDate) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.birthDate = birthDate;
    }

    // Getter and Setter methods
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getBirthDate() { return birthDate; }
    public void setBirthDate(String birthDate) { this.birthDate = birthDate; }
}
