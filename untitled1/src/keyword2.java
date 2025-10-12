class Animal {
    String name = "Animal";


    Animal() {
        System.out.println("Animal constructor called");
    }

    // Parent class method
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super();
        System.out.println("Dog constructor called");
    }
    void displayNames() {
        System.out.println("Parent name: " + super.name);
        System.out.println("Child name: " + name);
    }

    void sound() {
        // Call parent class method
        super.sound();
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.displayNames();
        d.sound();
    }
}