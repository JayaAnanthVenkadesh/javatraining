class ClubThread extends Thread {
    String club;

    ClubThread(String club) {
        this.club = club;
    }

    public void run() {
        System.out.println(club + " is preparing for the match...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(club + " is ready to play!");
    }
}
public class FootballClubsThreads {
    public static void main(String[] args) {
        ClubThread barcelona = new ClubThread("FC Barcelona");
        ClubThread realMadrid = new ClubThread("Real Madrid");
        ClubThread manUnited = new ClubThread("Manchester United");
        ClubThread liverpool = new ClubThread("Liverpool FC");
        ClubThread bayern = new ClubThread("Bayern Munich");
        ClubThread psg = new ClubThread("Paris Saint-Germain");

        barcelona.start();
        realMadrid.start();
        manUnited.start();
        liverpool.start();
        bayern.start();
        psg.start();
    }
}

