import java.util.Random;

public class MaxNumberFinder {
    public static void main(String[] args) {
        int[] numbers = new int[100];  // Array to store 100 numbers
        Random rand = new Random();

        // Generating 100 random numbers between 1 and 1000
        for (int i = 0; i < 100; i++) {
            numbers[i] = rand.nextInt(1000);  
        }

        // Finding the maximum number
        int max = numbers[0];  // Assume first number is max
        for (in t i = 1; i < 100; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Update max if a larger number is found
            }
        }

        // Display all numbers (Optional)
        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Display maximum number
        System.out.println("\nMaximum Number: " + max);
    }
}
