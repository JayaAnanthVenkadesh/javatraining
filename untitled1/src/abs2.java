abstract class Vehicle {
    abstract void start();

    void fuelType() {
        System.out.println("Most vehicles use fuel");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();

        c.start();
        b.start();
        c.fuelType();
    }
}


