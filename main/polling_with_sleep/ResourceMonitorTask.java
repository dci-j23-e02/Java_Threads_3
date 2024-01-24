package polling_with_sleep;

// A task that simulates monitoring a resource
public class ResourceMonitorTask implements  Runnable {


  @Override
  public void run() {
    while(!Thread.interrupted()){
      System.out.println("Monitoring resource....");

      // Simulate checking resource status
      // In real world scenario, this could be a network call or I/O operation

      try{
        Thread.sleep(2000); // Sleep for 2 seconds

      }catch(InterruptedException e){
        System.out.println("Resource monitoring interrupted.");
        break;
      }

    }
  }
}
