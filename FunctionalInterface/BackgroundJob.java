package FunctionalInterface;

public class BackgroundJob {
    public static void main(String[] args) {
        Runnable job = () -> System.out.println("Background job running asynchronously...");
        new Thread(job).start();
    }
}