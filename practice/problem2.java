package practice;
import java.util.Scanner;


public class problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();
        int number3 = number1+number2 ;
        System.out.println("Sum of two numbers is: " + number3);

        sc.close();
    }
}
