package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int tamanho = sc.nextInt();
		
		//criar matriz
		
		int[][] matriz = new int[tamanho][tamanho];
		
		for (int linha = 0; linha < matriz.length; linha++) {
			for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
				matriz[linha][coluna] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal: ");
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		System.out.println();
		
		int contador = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					contador += 1;
				}
			}
		}
		
		System.out.println("Números negativos: " + contador);
		
		//propiedade length
		//matriz.length: quantidade de linhas
		//matriz[linha].length: quantidade de colunas
		
		sc.close();
	}

}
