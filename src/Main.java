/*
Question : Write a program to check factorial of given number.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int digit,product = 1,temp;
        System.out.println("Enter the digit to find it's factorial.");
        digit = sc.nextInt();
        temp = digit;
        for (int i = temp; i >= 1; i--){
            product *= digit;
            digit--;
        }
        System.out.println("Printing the final result :");
        System.out.println(product);
    }
}