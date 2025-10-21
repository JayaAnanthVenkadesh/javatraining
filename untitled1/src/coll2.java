import java.util.ArrayList;

class Student {
    int id;
    String name;
    double marks;

    Student(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println(id + " - " + name + " - " + marks);
    }
}

public class StudentListExample {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", 88.5));
        students.add(new Student(2, "Bob", 76.2));
        students.add(new Student(3, "Charlie", 92.0));

        System.out.println("Student Details:");
        for (Student s : students) {
            s.display();
        }

        students.remove(1);

        System.out.println("\nAfter removing one student:");
        for (Student s : students) {
            s.display();
        }

        Student first = students.get(0);
        System.out.println("\nFirst student in the list:");
        first.display();
    }
}
