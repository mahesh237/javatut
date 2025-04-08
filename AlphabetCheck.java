import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is NOT an alphabet.");
        }
        
        scanner.close();
    }
}
