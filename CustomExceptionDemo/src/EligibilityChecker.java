public class EligibilityChecker {

    // Method to check age and throw custom exception
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is not valid for voting.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}
