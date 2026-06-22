package Simple_Calculations;
import java.util.Scanner;

public class SimpleCalculator {

	public static double add(double a, double b) {
		return a + b;
	}
	public static double subtract(double a, double b){
		return a - b;
	}
	public static double multiply(double a, double b) {
		return a * b;
	}
	public static double divide(double a, double b){
		if(b == 0) {
			System.out.println("Error: Cannot divide by zero");
			return 0;
		}
		return a / b;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Welcome to Simple Calculator");
		
		System.out.print("Enter first number: ");
		double a = s.nextDouble();
		
		System.out.print("Enter second number: ");
		double b = s.nextDouble();
		
		System.out.println("\n--- Results ---");
		System.out.println("Addition: "+ add(a, b));
		System.out.println("Subtraction: "+ subtract(a, b));
		System.out.println("Multiplication: "+ multiply(a, b));
		System.out.println("Division: "+ divide(a, b));
		
		s.close();
	}
}
