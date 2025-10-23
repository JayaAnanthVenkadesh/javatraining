class CityThread extends Thread {
    String city;

    CityThread(String city) {
        this.city = city;
    }

    public void run() {
        System.out.println("Fetching data for " + city + "..");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(city + " data fetched!");
    }
}

public class EuropeanCitiesSimple {
    public static void main(String[] args) {
        CityThread paris = new CityThread("Paris");
        CityThread berlin = new CityThread("Berlin");
        CityThread rome = new CityThread("Rome");
        CityThread dublin = new CityThread("Dublin");
        CityThread london = new CityThread("London");
        CityThread milan = new CityThread("Milan");

        paris.start();
        berlin.start();
        rome.start();
        dublin.start();
        london.start();
        milan.start();
    }
}

