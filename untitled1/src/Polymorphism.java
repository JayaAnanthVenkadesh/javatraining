class Animal {
    void speak() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void speak() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal {
    void speak() {
        System.out.println("Meow!");
    }
}

class Cow extends Animal {
    void speak() {
        System.out.println("Moo!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {

        Animal a;

        a = new Dog();
        a.speak();

        a = new Cat();
        a.speak();

        a = new Cow();
        a.speak();
    }
}

