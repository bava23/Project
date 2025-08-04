import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating a CopyOnWriteArrayList of Strings
        List<String> fruits = new CopyOnWriteArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("Original list: " + fruits);

        // Iterating and modifying inside the loop (safe with CopyOnWriteArrayList)
        for (String fruit : fruits) {
            System.out.println("Reading: " + fruit);
            if (fruit.equals("Banana")) {
                fruits.remove(fruit);  // Safe: no ConcurrentModificationException
            }
        }

        System.out.println("Modified list: " + fruits);
    }
}
