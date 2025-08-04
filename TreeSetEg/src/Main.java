import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeSet of Strings
        TreeSet<String> fruits = new TreeSet<>();

        // Adding elements
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will be ignored

        // Printing the TreeSet
        System.out.println("Sorted fruits:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // Checking for an element
        System.out.println("Contains Mango? " + fruits.contains("Mango"));

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        // Size of the TreeSet
        System.out.println("Total fruits: " + fruits.size());
    }
}
