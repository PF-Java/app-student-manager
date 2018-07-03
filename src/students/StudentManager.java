package students;

public class StudentManager {
    private Student[] students = new Student[5];
    private int size;
    public StudentManager() {
    }
    public void add(Student student) {
        students[size] = student;
        size++;
    }

}
