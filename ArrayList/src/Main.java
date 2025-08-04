import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Displaying the list
        System.out.println("Fruits List: " + fruits);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Apple

        // Updating an element
        fruits.set(1, "Mango"); // Replacing Banana with Mango
        System.out.println("Updated List: " + fruits);

        // Removing an element
        fruits.remove("Orange");
        System.out.println("After Removing Orange: " + fruits);

        // Iterating through the ArrayList
        System.out.println("All fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Size of the ArrayList
        System.out.println("Total fruits: " + fruits.size());
    }
}
