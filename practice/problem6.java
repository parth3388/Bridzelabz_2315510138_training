package practice;
import java.util.*;

public class problem6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Principal:");
		double Principal= sc.nextDouble();
		System.out.print("Rate:");
		double Rate= sc.nextDouble();
		System.out.print("Time:");
		double Time= sc.nextDouble();
		double SimpleInterest=(Principal * Rate * Time) / 100;
		System.out.print("Simple Interest:"+SimpleInterest);
		}

}
