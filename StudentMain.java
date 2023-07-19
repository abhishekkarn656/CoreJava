package Assignment1;

public class StudentMain {
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("Abhishek");
        System.out.println("unknown "+st.getName());
        Student t = new Student("Abhishek");
        System.out.println("name is "+t.getName());
    }
}
