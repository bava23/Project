// Class with a method that throws a custom checked exception
public class Validator {

    // Method that throws the custom exception
    public static void validateNumber(int number) throws InvalidNumberException {
        if (number < 0) {
            // 'throw' is used to throw the exception
            throw new InvalidNumberException("Negative number not allowed: " + number);
        } else {
            System.out.println("Valid number: " + number);
        }
    }
}
