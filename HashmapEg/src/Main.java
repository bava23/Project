import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Creating a HashMap with String keys and Integer values
        HashMap<String, Integer> studentMarks = new HashMap<>();

        // Adding key-value pairs
        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 90);
        studentMarks.put("Charlie", 78);
        studentMarks.put("Alice", 95); // Overwrites previous value for "Alice"

        // Printing the HashMap
        System.out.println("Student Marks:");
        for (String name : studentMarks.keySet()) {
            System.out.println(name + " -> " + studentMarks.get(name));
        }

        // Accessing a value by key
        System.out.println("Bob's Marks: " + studentMarks.get("Bob"));

        // Checking if a key exists
        System.out.println("Contains 'Charlie'? " + studentMarks.containsKey("Charlie"));

        // Removing a key-value pair
        studentMarks.remove("Charlie");
        System.out.println("After removing Charlie: " + studentMarks);

        // Size of the map
        System.out.println("Total students: " + studentMarks.size());
    }
}
