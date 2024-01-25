package polling_with_sleep;
/*
public class Main {

  public static void main(String[] args) throws InterruptedException{
    // Create tasks
    Runnable resourceMonitorTask = new ResourceMonitorTask();
    Runnable dataProcessingTask = new DataProcessingTask();

    // Create threads for the tasks
    Thread monitorThread = new Thread(resourceMonitorTask);
    Thread processingThread = new Thread(dataProcessingTask);


    // Start the threads
    monitorThread.start();
    processingThread.start();

    // Let the tasks run for a certain amount of time (e.g., 15 seconds)

    Thread.sleep(15000); // 15 seconds

    // Interrupt both tasks, simulating a shutdown or cancellation
    monitorThread.interrupt();
    processingThread.interrupt();

    // Wait for both threads to finish
    monitorThread.join();
    processingThread.join();

    // All tasks are completed
    System.out.println("Resource monitoring and data processing tasks have been completed.");


  }
}
*/