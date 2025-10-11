class Cricketer {
    void prepareForMatch() {
        System.out.println("Cricketer is preparing for the match.");
    }
}


class RohitSharma extends Cricketer {
    @Override
    void prepareForMatch() {
        System.out.println("Rohit Sharma is practicing power-hitting in the nets!");
    }
}


class RavindraJadeja extends Cricketer {
    @Override
    void prepareForMatch() {
        System.out.println("Ravindra Jadeja is working on fielding drills and spin bowling!");
    }
}


class KL Rahul extends Cricketer {
    @Override
    void prepareForMatch() {
        System.out.println("KL Rahul is focusing on wicketkeeping practice and steady batting!");
    }
}


public class MatchPreparation {
    public static void main(String[] args) {
        Cricketer[] team = {
                new RohitSharma(),
                new RavindraJadeja(),
                new KL Rahul()
        };

        System.out.println("=== Team India preparing for the match ===");
        for (Cricketer player : team) {
            player.prepareForMatch();
        }
    }
}
