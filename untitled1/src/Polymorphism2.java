class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting with a key...");
    }
}

class Bike extends Vehicle {
    void start() {
        System.out.println("Bike is starting with a kick...");
    }
}

class Airplane extends Vehicle {
    void start() {
        System.out.println("Airplane is starting its engines...");
    }
}

public class VehiclePolymorphism {
    public static void main(String[] args) {
        Vehicle v;

        v = new Car();
        v.start();

        v = new Bike();
        v.start();

        v = new Airplane();
        v.start();
    }
}

