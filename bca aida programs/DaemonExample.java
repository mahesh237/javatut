class DaemonExample extends Thread {
    public void run() {
        while (true) {
            System.out.println("Daemon thread running...");
        }
    }
    public static void main(String[] args) {
        DaemonExample t1 = new DaemonExample();
        t1.setDaemon(false);
        t1.start();
    }
}
