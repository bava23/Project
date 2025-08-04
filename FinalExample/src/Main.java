//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Constants obj = new Constants();

        // Accessing final variable
        System.out.println("Value of PI: " + Constants.PI);

        // Calling final method
        obj.displayMessage();

        // Uncommenting the below line will cause a compile-time error
        // Constants.PI = 3.14; // ❌ Error: cannot assign a value to final variable

        // Uncommenting this will also cause an error if you try to extend Constants
        // class ExtendedConstants extends Constants {} // ❌ Error: cannot subclass final class

    }
}