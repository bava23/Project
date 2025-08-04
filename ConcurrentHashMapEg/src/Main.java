import java.util.concurrent.ConcurrentHashMap;

public class Main {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();

        // Adding key-value pairs
        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Cherry", 30);

        System.out.println("Initial map: " + map);

        // Simulate concurrent modification using multiple threads
        Thread writerThread = new Thread(() -> {
            map.put("Date", 40);
            map.remove("Banana");
            System.out.println("Writer thread updated map: " + map);
        });

        Thread readerThread = new Thread(() -> {
            System.out.println("Reader thread reads map: " + map);
        });

        writerThread.start();
        readerThread.start();

        try {
            writerThread.join();
            readerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final map: " + map);
    }
}
