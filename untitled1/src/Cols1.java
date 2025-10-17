import java.util.*;

public class ListExample {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Mango");

        System.out.println("Fruits List: " + fruits);

        System.out.println("First fruit: " + fruits.get(0));

        fruits.set(1, "Blueberry");
        System.out.println("After modification: " + fruits);

        fruits.remove("Cherry");
        System.out.println("After removal: " + fruits);

        if (fruits.contains("Mango")) {
            System.out.println("Mango is in the list!");
        }

        System.out.println("\nIterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("\nTotal fruits: " + fruits.size());
    }
}