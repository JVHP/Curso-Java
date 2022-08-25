package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		// verifica��o se localizou
		boolean localizou = false;

		// n�mero de linhas
		int linha = sc.nextInt();
		// n�mero de colunas
		int coluna = sc.nextInt();

		Integer[][] matriz = new Integer[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();

			}

		}
		do {
			// n�mero para ser localizado
			int x = sc.nextInt();
	
			for (int i = 0; i < matriz.length; i++) {
				for (int j = 0; j < matriz[i].length; j++) {
					if (matriz[i][j] == x) {
						localizou = true;
						System.out.println("Posi��o " + i + ", " + j);
	
						if (j > 0) {
							System.out.println("Esquerda: " + matriz[i][j - 1]);
						}
	
						if (i > 0) {
							System.out.println("Cima: " + matriz[i - 1][j]);
						}
	
						if (j < matriz[i].length - 1) {
							System.out.println("Direita: " + matriz[i][j + 1]);
						}
	
						if (i < matriz.length - 1) {
							System.out.println("Baixo: " + matriz[i + 1][j]);
						}
						
						System.out.println();
	
					}
	
				}
	
			}
			
			if (!localizou) {
				System.out.println("N�mero n�o localizado na matriz, digite outro n�mero inteiro.");
			}
		
		} while(!localizou);

		sc.close();
	}

}
