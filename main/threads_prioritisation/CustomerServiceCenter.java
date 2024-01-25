package threads_prioritisation;

public class CustomerServiceCenter {

  public static void main(String[] args) {

    // Create customer objects with different bill amounts
    Customer customer1 = new Customer("Alice", 2500);
    Customer customer2 = new Customer("Bob", 1500);
    Customer customer3 = new Customer("Charlie", 300);
    Customer customer4 = new Customer("Diana", 1800);
    Customer customer5 = new Customer("Edward", 2200);

    // Create threads for each customer
    Thread thread1 = new Thread(customer1);
    Thread thread2 = new Thread(customer2);
    Thread thread3 = new Thread(customer3);
    Thread thread4 = new Thread(customer4);
    Thread thread5 = new Thread(customer5);

    // Set thread priorities based on bill amount
    setPriorityByBillAmount(thread1, customer1);
    setPriorityByBillAmount(thread2, customer2);
    setPriorityByBillAmount(thread3, customer3);
    setPriorityByBillAmount(thread4, customer4);
    setPriorityByBillAmount(thread5, customer5);

    // Start  customer threads
    thread1.start();
    thread2.start();
    thread3.start();
    thread4.start();
    thread5.start();

  }

  private static void setPriorityByBillAmount(Thread thread, Customer customer){
    // get bill amount -- BillAmount
    /*
     * use if statement to set priority
     * */
    // 2000 or more -> high
    // 1000 - 2000 -> normal
    // less than 500 -> low


    double billAmount = customer.getBillAmount();

    if (billAmount >= 2000){
     thread.setPriority(Thread.MAX_PRIORITY);
    }else if(billAmount >= 1000 && billAmount < 2000){
      thread.setPriority(Thread.NORM_PRIORITY);
    }else if(billAmount < 500){
      thread.setPriority(Thread.MIN_PRIORITY);
    }

  }
}
