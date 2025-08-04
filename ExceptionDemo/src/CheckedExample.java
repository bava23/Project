import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExample {
    // Method that throws a checked exception (IOException)
    public void readFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        System.out.println("First line from file: " + reader.readLine());
        reader.close();
    }
}
