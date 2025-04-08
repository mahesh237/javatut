class ProducerConsumer {
    int item;
    boolean available = false;

    synchronized void produce(int value) throws InterruptedException {
        while (available) {
            wait();
        }
        item = value;
        available = true;
        System.out.println("Produced: " + value);
        notify();
    }

    synchronized int consume() throws InterruptedException {
        while (!available) {
            wait();
        }
        available = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}

class Producer extends Thread {
    ProducerConsumer pc;

    Producer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        int i = 1;
        while (true) {
            try {
                pc.produce(i++);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Consumer extends Thread {
    ProducerConsumer pc;

    Consumer(ProducerConsumer pc) {
        this.pc = pc;
    }

    public void run() {
        while (true) {
            try {
                pc.consume();
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        Producer producer = new Producer(pc);
        Consumer consumer = new Consumer(pc);

        producer.start();
        consumer.start();
    }
}
