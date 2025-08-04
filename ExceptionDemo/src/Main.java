public class Main {
    public static void main(String[] args) {

        // Handling checked exception
        CheckedExample checked = new CheckedExample();
        try {
            checked.readFile("test.txt");  // File may not exist
        } catch (Exception e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        // Handling unchecked exception
        UncheckedException unchecked = new UncheckedException();
        try {
            unchecked.divide(10, 0);  // Causes ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}
