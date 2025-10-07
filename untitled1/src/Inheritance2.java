class Person {
    void introduce() {
        System.out.println("I am Jaya Ananth Venkadesh");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.introduce();
        s.study();
    }
}
