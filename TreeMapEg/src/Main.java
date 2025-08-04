import java.util.TreeMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Creating a TreeMap with String keys and Integer values
        TreeMap<String, Integer> studentScores = new TreeMap<>();

        // Adding key-value pairs
        studentScores.put("Alice", 88);
        studentScores.put("Bob", 75);
        studentScores.put("Charlie", 92);
        studentScores.put("David", 85);

        // Printing the TreeMap (automatically sorted by keys)
        System.out.println("Student Scores:");
        for (Map.Entry<String, Integer> entry : studentScores.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Accessing a value
        System.out.println("Score of Bob: " + studentScores.get("Bob"));

        // Checking if a key exists
        System.out.println("Contains Charlie? " + studentScores.containsKey("Charlie"));

        // Removing an entry
        studentScores.remove("David");

        System.out.println("After removing David:");
        for (String name : studentScores.keySet()) {
            System.out.println(name + " -> " + studentScores.get(name));
        }

        // Size of the map
        System.out.println("Total students: " + studentScores.size());
    }
}
