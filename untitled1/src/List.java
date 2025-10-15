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

        fruits.set(1, "Blueberry"); // Replace Banana with Blueberry
        System.out.println("After modification: " + fruits);

        fruits.remove("Cherry");
        System.out.println("After removing Cherry: " + fruits);

        System.out.println("Iterating with for-each loop:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("List size: " + fruits.size());
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        Collections.sort(fruits);
        System.out.println("Sorted List: " + fruits);

        fruits.clear();
        System.out.println("After clearing: " + fruits);
    }
}
