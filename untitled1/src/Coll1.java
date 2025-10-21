import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();


        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");


        System.out.println("Fruits List: " + fruits);


        System.out.println("First fruit: " + fruits.get(0));


        fruits.set(1, "Blueberry");
        System.out.println("After modification: " + fruits);


        fruits.remove("Mango");
        System.out.println("After removal: " + fruits);


        if (fruits.contains("Apple")) {
            System.out.println("Apple is in the list!");
        }


        System.out.println("Total fruits: " + fruits.size());


        System.out.println("\nIterating through the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
