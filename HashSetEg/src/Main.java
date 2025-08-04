import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // Creating a HashSet of Strings
        HashSet<String> cities = new HashSet<>();

        // Adding elements to the HashSet
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Bangalore");
        cities.add("Chennai");
        cities.add("Delhi");  // Duplicate, won't be added

        // Printing the HashSet
        System.out.println("Cities in the HashSet:");
        for (String city : cities) {
            System.out.println("- " + city);
        }

        // Checking if an element exists
        if (cities.contains("Mumbai")) {
            System.out.println("Mumbai is in the set.");
        }

        // Removing an element
        cities.remove("Chennai");
        System.out.println("After removing Chennai: " + cities);

        // Size of the HashSet
        System.out.println("Total cities: " + cities.size());
    }
}
