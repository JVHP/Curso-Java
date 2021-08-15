package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double soma = 0;
		
		Product[] vect = new Product[n];
		
		for (int i =0; i < vect.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
			
			soma += vect[i].getPrice();
		}
		
		double avg = soma / vect.length;
		
		System.out.printf("Preço médio: R$ %.2f", avg);
		
		sc.close();
	}

}
