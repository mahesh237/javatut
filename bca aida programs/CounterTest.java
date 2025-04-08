class Counter {  // Removed 'public'
    private int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

public class CounterTest {
    public static void main(String[] args) {
        Counter c = new Counter();  
        c.increment();
        System.out.println("Count: " + c.getCount());
    }
}
