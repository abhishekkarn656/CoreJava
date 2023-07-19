package Assignment1;

public class Student {
     private String name;

    public Student(String name) {
        this.name = name;
    }
    public Student() {
        this.name = "Unknown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
