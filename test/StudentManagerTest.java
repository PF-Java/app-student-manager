import students.Student;

public class StudentManagerTest {
    public static void main(String[] args) {
        Student trang = new Student("Trang", 23);
        System.out.println(trang.getInfomation());
        System.out.println("name: " + trang.getName());
        System.out.println("age: " + trang.getAge());


    }
}
