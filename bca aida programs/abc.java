import java.util.Scanner;
public class abc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number: " + max);
        sc.close();
    }
}