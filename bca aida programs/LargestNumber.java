// /* 1. Program to read two numbers from the user and print their product */
// import java.util.Scanner;
// public class MultiplyNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int num1 = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int num2 = sc.nextInt();
//         System.out.println("Product: " + (num1 * num2));
//         sc.close();
//     }
// }

// // /* 2. Program to print the square of a number passed through command line */
// // public class SquareNumber {
// //     public static void main(String[] args) {
// //         if (args.length > 0) {
// //             int num = Integer.parseInt(args[0]);
// //             System.out.println("Square: " + (num * num));
// //         } else {
// //             System.out.println("Please provide a number as a command line argument.");
// //         }
// //     }
// // }

// // /* 3. Program to send the name and surname of a student through command line arguments */
// // public class WelcomeStudent {
// //     public static void main(String[] args) {
// //         if (args.length == 2) {
// //             System.out.println("Welcome, " + args[0] + " " + args[1] + "!");
// //         } else {
// //             System.out.println("Please provide first name and surname as command line arguments.");
// //         }
// //     }
// // }

/* 4. Program to find the largest number out of N-natural numbers */
import java.util.Scanner;
public class LargestNumber {
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

// /* 5. Fibonacci and Factorial using recursion and non-recursion */
// class MathOperations {
//     static int fibonacciRecursive(int n) {
//         if (n <= 1) return n;
//         return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
//     }
    
//     static int factorialRecursive(int n) {
//         if (n == 0) return 1;
//         return n * factorialRecursive(n - 1);
//     }
    
//     static int factorialNonRecursive(int n) {
//         int fact = 1;
//         for (int i = 1; i <= n; i++) {
//             fact *= i;
//         }
//         return fact;
//     }
    
//     public static void main(String[] args) {
//         int num = 5;
//         System.out.println("Fibonacci (Recursive) of " + num + ": " + fibonacciRecursive(num));
//         System.out.println("Factorial (Recursive) of " + num + ": " + factorialRecursive(num));
//         System.out.println("Factorial (Non-Recursive) of " + num + ": " + factorialNonRecursive(num));
//     }
// }

// /* 6. Program to check whether a number is prime or not */
// import java.util.Scanner;
// public class PrimeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         boolean isPrime = num > 1;
//         for (int i = 2; i <= num / 2; i++) {
//             if (num % i == 0) {
//                 isPrime = false;
//                 break;
//             }
//         }
//         System.out.println(num + " is " + (isPrime ? "a Prime Number" : "not a Prime Number"));
//         sc.close();
//     }
// }

// /* 7. Program to check if a number is palindrome */
// import java.util.Scanner;
// public class PalindromeCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int original = num, reversed = 0;
//         while (num > 0) {
//             reversed = reversed * 10 + num % 10;
//             num /= 10;
//         }
//         System.out.println(original + " is " + (original == reversed ? "a Palindrome" : "not a Palindrome"));
//         sc.close();
//     }
// }

// /* 8. Program to print Fibonacci series up to N numbers */
// import java.util.Scanner;
// public class FibonacciSeries {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number of terms: ");
//         int n = sc.nextInt();
//         int a = 0, b = 1, c;
//         System.out.print("Fibonacci Series: " + a + " " + b);
//         for (int i = 2; i < n; i++) {
//             c = a + b;
//             System.out.print(" " + c);
//             a = b;
//             b = c;
//         }
//         System.out.println();
//         sc.close();
//     }
// }
/* 9. Program to find the sum of digits of a number */
// import java.util.Scanner;
// public class SumOfDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt();
//         int sum = 0;
//         while (num > 0) {
//             sum += num % 10;
//             num /= 10;
//         }
//         System.out.println("Sum of digits: " + sum);
//         sc.close();
//     }
// }

// /* 10. Program to check if a year is a leap year */
// import java.util.Scanner;
// public class LeapYearCheck {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a year: ");
//         int year = sc.nextInt();
//         boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
//         System.out.println(year + " is " + (isLeap ? "a Leap Year" : "not a Leap Year"));
//         sc.close();
//     }
// }

// /* 11. Program to swap two numbers without using a third variable */
// import java.util.Scanner;
// public class SwapNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
        
//         a = a + b;
//         b = a - b;
//         a = a - b;
        
//         System.out.println("After swapping: a = " + a + ", b = " + b);
//         sc.close();
//     }
// }

// /* 12. Program to calculate the power of a number */
// import java.util.Scanner;
// public class PowerCalculation {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter base: ");
//         int base = sc.nextInt();
//         System.out.print("Enter exponent: ");
//         int exp = sc.nextInt();
//         int result = 1;
//         for (int i = 0; i < exp; i++) {
//             result *= base;
//         }
//         System.out.println(base + "^" + exp + " = " + result);
//         sc.close();
//     }
// }

// /* 13. Program to find the GCD of two numbers */
// import java.util.Scanner;
// public class GCD {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         while (b != 0) {
//             int temp = b;
//             b = a % b;
//             a = temp;
//         }
//         System.out.println("GCD: " + a);
//         sc.close();
//     }
// }

// /* 14. Program to reverse a string */
// import java.util.Scanner;
// public class ReverseString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a string: ");
//         String str = sc.nextLine();
//         String reversed = new StringBuilder(str).reverse().toString();
//         System.out.println("Reversed string: " + reversed);
//         sc.close();
//     }
// }

// /* 15. Program to check whether a number is Armstrong or not */
// import java.util.Scanner;
// public class ArmstrongNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt(), sum = 0, temp = num;
//         int digits = String.valueOf(num).length();
//         while (temp > 0) {
//             int digit = temp % 10;
//             sum += Math.pow(digit, digits);
//             temp /= 10;
//         }
//         System.out.println(num + " is " + (sum == num ? "an Armstrong number" : "not an Armstrong number"));
//         sc.close();
//     }
// }

// /* 16. Program to print Pascal's Triangle */
// import java.util.Scanner;
// public class PascalsTriangle {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter number of rows: ");
//         int n = sc.nextInt();
//         for (int i = 0; i < n; i++) {
//             int num = 1;
//             for (int j = 0; j <= i; j++) {
//                 System.out.print(num + " ");
//                 num = num * (i - j) / (j + 1);
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }

// /* 17. Program to convert decimal to binary */
// import java.util.Scanner;
// public class DecimalToBinary {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a decimal number: ");
//         int num = sc.nextInt();
//         System.out.println("Binary: " + Integer.toBinaryString(num));
//         sc.close();
//     }
// }

// /* 18. Program to check whether a number is perfect or not */
// import java.util.Scanner;
// public class PerfectNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int num = sc.nextInt(), sum = 0;
//         for (int i = 1; i < num; i++) {
//             if (num % i == 0) {
//                 sum += i;
//             }
//         }
//         System.out.println(num + " is " + (sum == num ? "a Perfect number" : "not a Perfect number"));
//         sc.close();
//     }
// }

// /* 19. Program to generate prime numbers up to N */
// import java.util.Scanner;
// public class PrimeNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N: ");
//         int n = sc.nextInt();
//         for (int num = 2; num <= n; num++) {
//             boolean isPrime = true;
//             for (int i = 2; i <= Math.sqrt(num); i++) {
//                 if (num % i == 0) {
//                     isPrime = false;
//                     break;
//                 }
//             }
//             if (isPrime) {
//                 System.out.print(num + " ");
//             }
//         }
//         System.out.println();
//         sc.close();
//     }
// }

// /* 20. Program to find LCM of two numbers */
// import java.util.Scanner;
// public class LCM {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();
//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();
//         int lcm = (a * b) / new GCD().findGCD(a, b);
//         System.out.println("LCM: " + lcm);
//         sc.close();
//     }
// }
