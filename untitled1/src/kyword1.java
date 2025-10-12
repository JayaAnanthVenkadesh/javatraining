final class Vehicle {

    final int speedLimit = 120;

    final void displaySpeed() {
        System.out.println("Speed limit is: " + speedLimit + " km/h");
    }
}



public class Main {
    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.displaySpeed();
    }
}

