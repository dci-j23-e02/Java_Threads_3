package concurrency_api;


// A task that simulates processing a file
public class FileProcessorTask implements  Runnable {

  // Attributes
  private final String fileName;

  public FileProcessorTask(String fileName) {
    this.fileName = fileName;
  }


  @Override
  public void run() {
    System.out.println("Processing file: "+ fileName);
    try{
      // Simulate time taken to process a file
      Thread.sleep(3000);
    } catch (InterruptedException e) {
      System.out.println("File processing was interrupted for: "+fileName);
    }
    System.out.println("File: "+ fileName + " processed.");
  }
}
