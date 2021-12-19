import java.util.Locale;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Boa! Olá Mundo!");
//		int y = 32;
//		double x = 10.35784;
//		System.out.println(y);
//		System.out.println(x);
		//System.out.printf(null, x); imprime algo formatado
		Locale.setDefault(Locale.US);
		//System.out.printf("%.4f%n", x);
//		System.out.println("Bom dia!");
//		System.out.println("RESULTADO: " + x + " METROS");
//		System.out.printf("RESULTADO: %.2f METROS%n", x);
		String nome = "Mario";
		int idade = 29;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e recebe R$%.2f reais%n", nome, idade, renda);
	}

}
