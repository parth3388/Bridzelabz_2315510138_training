package practice;
import java.util.*;


public class problem10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter kilometer: ");
        double kilometer = sc.nextInt();
        double miles=kilometer * 0.621371;
        System.out.println("Distance in miles: " + miles);

        sc.close();
    }
}
