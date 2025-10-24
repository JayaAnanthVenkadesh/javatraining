class StudentThread extends Thread {
    private String studentName;

    public StudentThread(String name) {
        this.studentName = name;
    }

    @Override
    public void run() {
        System.out.println(studentName + " has entered the classroom.");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(studentName + " was interrupted.");
        }
        System.out.println(studentName + " has finished studying.");
    }
}

public class SchoolMultithreading {
    public static void main(String[] args) {

        StudentThread s1 = new StudentThread("Alice");
        StudentThread s2 = new StudentThread("Bob");
        StudentThread s3 = new StudentThread("Charlie");

        s1.start();
        s2.start();
        s3.start();
    }
}

