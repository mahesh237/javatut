class Counter {
    private int count = 0;
    // Synchronized method ensures only one thread increments at a time
    public synchronized void increment() {
    count++;
    }
    public int getCount() {
    
    return count;
    }
    }
    class CounterThread extends Thread {
    private Counter counter;
    public CounterThread(Counter counter) {
    this.counter = counter;
    }
    public void run() {
    for (int i = 0; i < 1000; i++) {
    counter.increment(); // Multiple threads incrementing count
    }
    }
    }
    public class Mainn {
    public static void main(String[] args) {
    Counter counter = new Counter();
    // Creating multiple threads that share the same Counter object
    CounterThread t1 = new CounterThread(counter);
    CounterThread t2 = new CounterThread(counter);
    CounterThread t3 = new CounterThread(counter);
    t1.start();
    t2.start();
    t3.start();
    // Wait for threads to complete
    try {
    t1.join();
    t2.join();
    t3.join();
    } catch (InterruptedException e) {
    e.printStackTrace();
    }
    // Final value should be 3000 if synchronization works correctly
    System.out.println("Final count:" + counter.getCount());
    }
    }