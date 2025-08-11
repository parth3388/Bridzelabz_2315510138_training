package practice;
import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter tempratures in celciuss:");
		int Celsius = sc.nextInt();
		int Fahrenheit = (Celsius * 9/5) + 32 ;
		System.out.print("Temprature in Fahrenheit:"+Fahrenheit);
		sc.close();
		
		
	}

}
