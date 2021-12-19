package do_while;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char yn;
		
		do {			
			System.out.print("Digite a temperatura em Celsius: ");
			float tempC = sc.nextFloat();
			float tempF = 9 * tempC / 5 + 32;
			System.out.println("Equivalente em Fahrenheit: " + tempF);
			System.out.print("Deseja repetir(s/n)? ");
			yn = sc.next().charAt(0);
		} while (yn != 'n');
		
		sc.close();

	}

}
