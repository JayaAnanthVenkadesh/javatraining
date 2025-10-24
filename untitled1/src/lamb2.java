interface ScoreCalculator {
    int calculateRuns(int singles, int fours, int sixes);
}

public class CricketScoreLambda {
    public static void main(String[] args) {

        ScoreCalculator score = (singles, fours, sixes) -> (singles * 1) + (fours * 4) + (sixes * 6);

        int viratRuns = score.calculateRuns(30, 10, 2);
        int dhoniRuns = score.calculateRuns(25, 8, 3);

        System.out.println("Virat Kohli scored: " + viratRuns + " runs");
        System.out.println("MS Dhoni scored: " + dhoniRuns + " runs");
    }
}

