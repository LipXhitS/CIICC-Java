package Task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Input Palindrome: ");
            StringBuilder ogPalindrome = new StringBuilder(scanner.nextLine());
            String result = ogPalindrome.toString().equals((new StringBuilder(ogPalindrome).reverse()).toString()) ? "The input string is a palindrome" : "The input string is not a palindrome";
            System.out.println(result);
        }
    }
}