interface CricketPlayer {
    void play(String playerName);
}

public class CricketLambdaExample {
    public static void main(String[] args) {

        CricketPlayer player = (name) -> {
            System.out.println(name + " is batting and hitting boundaries!");
        };

        player.play("Virat Kohli");
        player.play("Rohit Sharma");
    }
}
