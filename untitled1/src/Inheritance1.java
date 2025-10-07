class Animal {
    void eat() {
        System.out.println("I am eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I am barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.bark();
    }
}
