package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyCalculator;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the dollar price? ");
		double currency = sc.nextDouble();
		
		System.out.print("How many dollar's will be bought? ");
		double amount = sc.nextDouble();
		
		double total = CurrencyCalculator.convert(amount, currency);
		System.out.printf("Amount to be paid in Brazillian Real = BRL %.2f", total);
		
		sc.close();
	}

}
