package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tamanho = sc.nextInt();
		double[] vect = new double[tamanho];
		double sum = 0;
		
		for (int i = 0; i < tamanho; i++) {
			vect[i] = sc.nextDouble();
			sum+=vect[i];
		}
		
		double media = sum / tamanho;
		
		System.out.printf("Altura média: %.2fm",media);
		
		sc.close();
	}

}
