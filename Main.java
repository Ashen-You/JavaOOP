import model.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Travis You", 22, '1', 35);
        System.out.println("Student Name:   " + student.getName());
        System.out.println("Student Age:    " + student.getAge());
        System.out.println("Student Gender: " + (student.getGender() == 1 ? "male": "female"));
        System.out.println("Student ID NO:  " + student.getStudentNumber());
    }
}
