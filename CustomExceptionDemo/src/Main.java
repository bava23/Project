public class Main {
    public static void main(String[] args) {
        try {
            EligibilityChecker.checkEligibility(16);  // Throws exception
        } catch (InvalidAgeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }
}
