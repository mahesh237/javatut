interface Vehicle {
    void start();//only declare
    
    // Default method with implementation
    default void fuel() {
    System.out.println("Vechile need fuel");
    }
    static void scooter() {
        System.out.println("scooter starting");
        
        }
    
    }
    
    class Car implements Vehicle {
    public void start() {//we are defining the interface method 
    System.out.println("Car starting");
    }
    }
    
    public class Main {
    public static void main(String args[]) {
    Car myCar = new Car();
    myCar.start();
    myCar.fuel(); // Calling default method
    Vehicle.scooter();
    }
    }