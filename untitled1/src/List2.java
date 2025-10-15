import java.util.*;

public class CricketPlayersList {
    public static void main(String[] args) {
        List<String> players = new ArrayList<>();

        players.add("Virat Kohli");
        players.add("Rohit Sharma");
        players.add("MS Dhoni");
        players.add("Sachin Tendulkar");
        players.add("Yuvraj Singh");

        System.out.println("Cricket Players List: " + players);

        players.add(2, "KL Rahul");
        System.out.println("After adding KL Rahul: " + players);

        players.remove("Yuvraj Singh");
        System.out.println("After removing Yuvraj Singh: " + players);

        System.out.println("Player at index 1: " + players.get(1));

        players.set(0, "Shubman Gill");
        System.out.println("After replacing Virat Kohli with Shubman Gill: " + players);

        Collections.sort(players);
        System.out.println("Sorted Players List: " + players);

        System.out.println("Iterating through players:");
        for (String player : players) {
            System.out.println(player);
        }

        System.out.println("Contains MS Dhoni? " + players.contains("MS Dhoni"));

        System.out.println("Total players: " + players.size());
    }
}

