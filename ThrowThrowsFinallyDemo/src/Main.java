// Main class demonstrating try-catch-finally
public class Main {
    public static void main(String[] args) {
        try {
            Validator.validateNumber(-5);  // This will throw an exception
        } catch (InvalidNumberException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("Inside finally block: Cleanup done.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
