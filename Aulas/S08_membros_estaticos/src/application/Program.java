package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

public class Program {

	///////////////PRIMEIRA VERSÃO/////////////////
//	
//	public static final /*final diz que o valor eh constante*/double PI = 3.14159;
//						//Padrao de nome para constante é em uppercase.
//	
//	public static void main(String[] args) {
//		//Dentro de um método estatico não pode chamar outros que não sejam estáticos
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
//		
//		double c = circumference(radius);
//		
//		double v = volume(radius);
//		
//		System.out.printf("Circumfrence: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		
//		System.out.printf("PI value: %.2f%n", PI);
//		sc.close();
//	}
//
//	public static double circumference(double radius) {
//		return 2 * PI * radius;
//	}
//	
//	public static double volume(double radius) {
//		return 4 * PI * Math.pow(radius, 3) / 3;
//	}
	
	///////////////SEGUNDA VERSÃO/////////////////
//	
//	public static void main(String[] args) {
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner(System.in);
//		
//		Calculator calc = new Calculator();
//		
//		System.out.print("Enter radius: ");
//		double radius = sc.nextDouble();
//		
//		double c = calc.circumference(radius);
//		
//		double v = calc.volume(radius);
//		
//		System.out.printf("Circumfrence: %.2f%n", c);
//		System.out.printf("Volume: %.2f%n", v);
//		System.out.printf("PI value: %.2f%n", calc.PI);
//		
//		sc.close();
//	}
	
	///////////////TERCEIRA VERSÃO/////////////////

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter radius: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumfrence: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		sc.close();
	}
	
}
