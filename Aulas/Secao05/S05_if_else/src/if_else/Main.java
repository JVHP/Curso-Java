package if_else;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
//		int hora;
//		
//		System.out.println("Quantas horas?");
//		hora = sc.nextInt();
//		
//		if (hora < 12) System.out.println("Bom dia");
//		
//		else if (hora < 18) System.out.println("Boa tarde");
//		
//		else System.out.println("Boa noite");
		
		float x, y;
		x = 0;
		y = 0;
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		if (x == 0) {
			System.out.println("Eixo X");
		} else if (y == 0) {
			System.out.println("Eixo Y");
		} else if (x == 0 && y == 0) {
			System.out.println("Origem");
		} else if (x > 0 && y > 0) {
			System.out.println("Q1");
		} else if (x < 0 && y > 0) {
			System.out.println("Q2");
		} else if (x < 0 && y < 0) {
			System.out.println("Q3");
		} else if (x > 0 && y < 0) {
			System.out.println("Q4");
		} else {
			System.out.println("Não localizado");
		}
		
		
		
		sc.close();
		
	}

}
