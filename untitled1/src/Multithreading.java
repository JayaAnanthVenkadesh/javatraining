class KohliBatting extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            int runs = (int) (Math.random() * 7);
            System.out.println("🏏 Kohli hits the ball... scored " + runs + " runs!");
            try {
                Thread.sleep(700);
            } catch (InterruptedException e) {
                System.out.println("Kohli's batting was interrupted.");
            }
        }
        System.out.println("Kohli finished his batting session!");
    }
}

class Bowler extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Bowler delivers ball " + i);
            try {
                Thread.sleep(600);
            } catch (InterruptedException e) {
                System.out.println("Bowler was interrupted.");
            }
        }
        System.out.println("Bowler finished his spell!");
    }
}

class Commentator extends Thread {
    public void run() {
        String[] comments = {
                "What a beautiful cover drive!",
                "That's a powerful pull shot!",
                "Kohli is in great form today!",
                "Perfect timing!",
                "The crowd is loving it!"
        };
