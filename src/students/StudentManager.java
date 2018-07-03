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

    public void displayAll() {
        if (size == 0) {
            System.out.println("There is no any student in ");
        } else if (size == 1) {
            System.out.println("There is 1 student in list");
            System.out.print(students[0].getInfomation() + "");
            System.out.println();
        } else {
            System.out.println("There are " + size + " student list:");
            for (int i = 0; i < size; i++) {
                System.out.print(students[i].getInfomation() + ", ");
            }
            System.out.println();
        }
    }

}
