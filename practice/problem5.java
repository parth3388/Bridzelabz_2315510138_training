package practice;
import java.util.*;

public class problem5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the radius of cylinder:");
		double radius= sc.nextDouble();
		System.out.print("Enter the height of cylinder:");
		double height = sc.nextDouble();
		double Volume=Math.PI* Math.pow(radius, 2) * height;
		System.out.print("Volume:"+ Volume);
	}

}
