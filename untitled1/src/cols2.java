import java.util.*;

class Student {
    int id;
    String name;
    double grade;

    Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String toString() return "ID: " + id + ", Name: " + name + ", Grade: " + grade;
    }
}

public class StudentListExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 88.5));
        students.add(new Student(102, "Bob", 92.3));
        students.add(new Student(103, "Charlie", 79.4));
        System.out.println("Student List:");
        for (Student s : students) {
            System.out.println(s);
        }

        students.add(new Student(104, "Diana", 85.0));

        students.remove(1);
        System.out.println("\nAfter removing one student:");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nStudents grade above 85:");
        for (Student s : students) {
            if (s.grade > 85) {
                System.out.println(s.name + " (" + s.grade + ")");
            }
        }
    }
}
