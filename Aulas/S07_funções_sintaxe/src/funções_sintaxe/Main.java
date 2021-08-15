package funções_sintaxe;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		
		showResult(higher);
		
		sc.close();
		
	}
	
	public static int max(int x, int y, int z) {
		int result = 0;
		
		if (x > y && x > z) {
			System.out.println("The first number is bigger than the others");
			result = x;
			
		} else if (y > x && y > z) {
			System.out.println("The second number is bigger than the others");
			result = y;
			
		} else if (z > x && z > y) {
			System.out.println("The third number is bigger than the others");
			result = z;
			
		} else if (x == y && x == z) {
			System.out.println("All numbers has same values");
			
		}
		
		return result;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher: " + value);
	}

}
