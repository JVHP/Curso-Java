package debug;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroquadrado = sc.nextDouble();
		
		double area = largura * comprimento;
		double preco = area * metroquadrado;
		
		System.out.printf("Area = %.2fm %n", area);
		System.out.printf("Preço = R$%.2f reais", preco);
		
		sc.close();
		
	}

}
