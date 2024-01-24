package polling_with_sleep;


// A task that simulates processing data at regular  intervals
public class DataProcessingTask implements Runnable{

  @Override
  public void run() {
    while(! Thread.interrupted()){
      System.out.println("Processing data....");

      // Simulate checking resource status
      // In real world scenario, this involves CPU intensive computation

      try{
        Thread.sleep(5000); // Sleep for 5 seconds
      }catch (InterruptedException e){
        System.out.println("Data processing interrupted.");
        break;
      }
    }
  }
}
