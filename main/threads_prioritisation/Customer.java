package threads_prioritisation;

public class Customer implements  Runnable {

  private final String name;
  private final double billAmount;

  public Customer(String name, double billAmount) {
    this.name = name;
    this.billAmount = billAmount;
  }



  @Override
  public void run() {
    System.out.println(name + " with bill €" + billAmount+ " is being served.");

    // Simulate service time
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println(name+" has been served.");
  }

  public double getBillAmount() {
    return billAmount;
  }
}
