import java.util.*;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        if(num1 > num2 & num1 > num3) System.out.println("The largest number is " + num1);
        if(num2 > num1 & num2 > num3) System.out.println("The largest number is " + num2);
        if(num3 > num1 & num3 > num2) System.out.println("The largest number is " + num3);
        if(num1 == num2 & num1 == num3 & num2 == num3) System.out.println("All numbers are equal");
    }
}