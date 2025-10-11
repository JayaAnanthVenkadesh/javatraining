class Cricketer {
    void play() {
        System.out.println("Cricketer is playing cricket.");
    }
}

class Batsman extends Cricketer {
    @Override
    void play() {
        System.out.println("Batsman is batting and scoring runs!");
    }
}

class Bowler extends Cricketer {
    @Override
    void play() {
        System.out.println("Bowler is bowling to take wickets!");
    }
}
class AllRounder extends Cricketer {
    @Override
    void play() {
        System.out.println("All-rounder is batting and bowling effectively!");
    }
}

public class CricketMatch {
    public static void main(String[] args) {
        // Polymorphism: same reference type, different object types
        Cricketer c1 = new Batsman();
        Cricketer c2 = new Bowler();
        Cricketer c3 = new AllRounder();

        // Each object calls its own version of play()
        c1.play();
        c2.play();
        c3.play();
    }
}
