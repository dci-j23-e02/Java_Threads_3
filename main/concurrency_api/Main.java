package concurrency_api;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class Main {

  public static void main(String[] args) {
    // Crate an ExecutorService with a fixed thread pool size
    ExecutorService executorService = Executors.newFixedThreadPool(4);

    // Submit tasks to the executorService

    for (int i = 1; i <= 5 ; i++) {

      executorService.submit(new FileProcessorTask("File"+i+".txt"));

    }

    executorService.submit(new DatabaseCleanupTask());

    // Initiate a graceful shutdown
    executorService.shutdown();

    try {
      // Wait for all tasks to finish or timeout after 10 minutes
      if(! executorService.awaitTermination(10, TimeUnit.MINUTES)){
        // Force shutdown if tasks did not finish in time
        executorService.shutdownNow();
      }
    } catch (InterruptedException e) {
      // Interrupted while waiting for termination
      executorService.shutdownNow();
    }

    // All tasks are completed or the timeout was reached
    System.out.println("All tasks are completed or the timeout was reached ");
  }
}
