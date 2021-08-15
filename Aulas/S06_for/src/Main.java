import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
//		int soma = 0;

//		for (int i = 0; i < N; i++) {
//			int x = sc.nextInt();
//			soma += x;
//		}
		
//		System.out.println(soma);

		int somaIn = 0;
		int somaOut = 0;
		
		for (int i = 0; i < N; i++) {
			
			int x = sc.nextInt();
			
			if (x >= 10 && x <= 20) {
				somaIn += 1;
			} else {
				somaOut += 1;
			}
			
		}
		
		System.out.println(somaIn + " in");
		System.out.println(somaOut + " out");

		sc.close();

	}

}
