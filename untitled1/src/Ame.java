public class

class CityThread extends Thread {
    String city;

    CityThread(String city) {
        this.city = city;
    }

    public void run() {
        System.out.println("Processing data for " + city + "...");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(city + " data processed!");
    }
}

public class USCitiesSimple {
    public static void main(String[] args) {
        // Create threads for U.S. cities
        CityThread newYork = new CityThread("New York");
        CityThread losAngeles = new CityThread("Los Angeles");
        CityThread chicago = new CityThread("Chicago");
        CityThread houston = new CityThread("Houston");
        CityThread houston = new CityThread("Boston");
        CityThread miami = new CityThread("Miami");
        CityThread sanFrancisco = new CityThread("San Francisco");

        // Start all threads
        newYork.start();
        losAngeles.start();
        chicago.start();
        houston.start();
        boston.start();
        miami.start();
        sanFrancisco.start();
    }
}{
}
