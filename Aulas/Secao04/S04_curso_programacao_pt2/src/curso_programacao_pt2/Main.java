package curso_programacao_pt2;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		String b;
//		b = sc.next(); //O next le somente ate antes de um espaço
//		System.out.println("Você digitou: " + b);
//		
//		int i;
//		i = sc.nextInt();
//		System.out.println("Você digitou: " + i);
//		
//		double a;
//		a = sc.nextDouble();
//		System.out.println("Você digitou: " + a);
//		
//		char s;
//		s = sc.next().charAt(0);
//		System.out.println("Você digitou: " + s);
		
//		String x;
//		int y;
//		double z;
//		
//		x = sc.next();
//		y = sc.nextInt();
//		z = sc.nextDouble();
//		
//		System.out.println("Dados digitados:");
//		System.out.println(x);
//		System.out.println(y);
//		System.out.println(z);
		
//		String s1, s2, s3;
//		
//		s1 = sc.nextLine();//O nextLine le a linha inteira
//		s2 = sc.nextLine();
//		s3 = sc.nextLine();
//		
//		System.out.println("Dados digitados:");
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		
//		sc.close();
		
		int x;
		String s1, s2, s3;
		
		x = sc.nextInt();
		s1 = sc.nextLine();//O nextLine le a linha inteira
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Dados digitados:");
		sc.nextLine();//Este é nesscessário pois quando você aperta enter, esse espo do enter fica pendente e o s1 atribui este espaço
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
		
	}

}
