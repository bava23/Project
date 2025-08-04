public class UncheckedException {
    // Method that may cause an unchecked exception (ArithmeticException)
    public void divide(int a, int b) {
        int result = a / b; // May throw ArithmeticException if b == 0
        System.out.println("Division result: " + result);
    }
}
