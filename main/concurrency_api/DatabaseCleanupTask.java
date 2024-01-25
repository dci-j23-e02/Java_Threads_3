package concurrency_api;


// A task that simulate cleaning up database entries
public class DatabaseCleanupTask implements Runnable {

  @Override
  public void run() {
    System.out.println("Cleaning up database...");
    try{
      // Simulate time taken to clean up database
      Thread.sleep(5000);
    } catch (InterruptedException e) {
      System.out.println("Database clean up was interrupted.");
    }
    System.out.println("Database clean up complete.");
  }
}
