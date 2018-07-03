import students.Student;
import students.StudentManager;

public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();


        Student trang = new Student("Trang", 23);
        studentManager.add(trang);
        System.out.println("added " + trang.getInfomation());
        studentManager.displayAll();

        Student loan = new Student("Loan", 25);
        studentManager.add(loan);
        System.out.println("added " + loan.getInfomation());
        studentManager.displayAll();

        Student anh = new Student("Anh", 20);
        studentManager.add(anh);
        System.out.println("added " + anh.getInfomation());
        studentManager.displayAll();

        studentManager.find("Trang");
        studentManager.find("Loan");
        studentManager.find("Hung");
    }
}
