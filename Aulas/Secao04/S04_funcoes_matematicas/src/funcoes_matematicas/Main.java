package funcoes_matematicas;

public class Main {

	public static void main(String[] args) {
		// Math.sqrt(x) raiz quadrada
		// Math.pow(x, y) potência, x elevado a y
		// Math.abs(x) valor absoluto
//		double x = 3.0;
//		double y = 4.0;
//		double z = -5.0;
//		double A, B, C;
//
//		A = Math.sqrt(x);
//		B = Math.sqrt(y);
//		C = Math.sqrt(25.0);
//		System.out.println("Raiz quadrada de " + x + " = " + A);
//		System.out.println("Raiz quadrada de " + y + " = " + B);
//		System.out.println("Raiz quadrada de 25 = " + C);
//		
//		A = Math.pow(x, y);
//		B = Math.pow(x, 2.0);
//		C = Math.pow(5.0, 2.0);
//		System.out.println(x + " elevado a " + y + " = " + A);
//		System.out.println(x + " elevado a 2 = " + B);
//		System.out.println("5 elevado a 2 = " + C);
//		
//		A = Math.abs(y);
//		B = Math.abs(z);
//		System.out.println("Valor absoluto de " + y + " = " + A);
//		System.out.println("Valor absoluto de " + z + " = " + B);

		double a, b, c, delta, x1, x2;

		a = -4.0;
		b = 3.0;
		c = 5.0;

		delta = (Math.pow(b, 2.0)) - 4.0 * a * c;

		if (delta > 0) {
			x1 = (-b + (Math.sqrt(delta))) / (2.0 * a);
			x2 = (-b - (Math.sqrt(delta))) / (2.0 * a);
			System.out.println("Valor de delta: " + delta);
			System.out.println("X1: " + x1);
			System.out.println("X2: " + x2);
		} else {

			System.out.println("Valor de delta: " + delta);
			System.out.println("Valor de delta é negativo, portando não continua a operação");

		}

	}

}
