import students.Student;
import students.StudentManager;

public class StudentManagerTest {
    public static void main(String[] args) {
        Student trang = new Student("Trang", 23);
        StudentManager studentManager = new StudentManager();
        studentManager.add(trang);
        System.out.println("added " + trang.getInfomation());
        studentManager.displayAll();
    }
}
