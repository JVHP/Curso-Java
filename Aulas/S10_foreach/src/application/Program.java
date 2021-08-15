package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		System.out.println("For normal:");
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println();
		
		System.out.println("ForEach:");
		for (String nome : vect) {
			System.out.println(nome);
		}
		
		sc.close();
	}

}
