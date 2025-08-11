package practice;
import java.util.*;
public class problem4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the radius:");
		double radius= sc.nextDouble();
		double area= Math.PI* Math.pow(radius,2) ;
		System.out.print("Area of circle :"+area);
		sc.close();
	}

}
