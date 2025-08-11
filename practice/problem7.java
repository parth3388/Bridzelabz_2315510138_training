package practice;
import java.util.*;

public class problem7 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter width:");
		double width=sc.nextDouble();
		System.out.print("Enter length:");
		double length =sc.nextDouble();
		double Perimeter=2 * (length + width);
		System.out.print("Perimeter :"+Perimeter);
		sc.close();
	}
}
