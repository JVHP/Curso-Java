package funcoes_intersessantes_string;

public class Main {

	public static void main(String[] args) {

		String original = "abcde FGHIJ ABC abc DEFG    ";

		// Para formatar em letras minusculas
		System.out.println("toLowerCase");
		String s01 = original.toLowerCase();
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");

		System.out.println("");

		// Para formatar em letras maiusculas
		System.out.println("toUpperCase");
		String s02 = original.toUpperCase();
		System.out.println("Original: -" + original + "-");
		System.out.println("toUpperCase: -" + s02 + "-");

		System.out.println("");

		// Para remover espaços nos cantos
		System.out.println("trim");
		String s03 = original.trim();
		System.out.println("Original: -" + original + "-");
		System.out.println("trim: -" + s03 + "-");

		System.out.println();

		// Recortar uma string
		System.out.println("substring(inicio)");
		String s04 = original.substring(2);
		System.out.println("Original: -" + original + "-");
		System.out.println("substring: -" + s04 + "-");

		System.out.println("");

		System.out.println("substring(inicio, fim)");
		String s05 = original.substring(2, 9);
		System.out.println("Original: -" + original + "-");
		System.out.println("substring: -" + s05 + "-");

		System.out.println("");

		// Substituir
		System.out.println("replace(char, char)");
		String s06 = original.replace('a', 'x');
		System.out.println("Original: -" + original + "-");
		System.out.println("replace: -" + s06 + "-");

		System.out.println("");

		System.out.println("replace(string, string)");
		String s07 = original.replace("abc", "xy");
		System.out.println("Original: -" + original + "-");
		System.out.println("replace: -" + s07 + "-");

		System.out.println("");

		// Buscar em uma string
		System.out.println("indexOf()");
		int i = original.indexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("indexOf: -" + i + "-");

		System.out.println("");

		System.out.println("lastIndexOf()");
		int i2 = original.lastIndexOf("bc");
		System.out.println("Original: -" + original + "-");
		System.out.println("lastIndexOf: -" + i2 + "-");

		System.out.println("");

		// Recortar string com base em separador
		System.out.println("split");
		String s = "potato apple lemon";
		System.out.println("Original: -" + s + "-");
		String[] vect = s.split(" ");
		String word1 = vect[0];
		String word2 = vect[1];
		String word3 = vect[2];
		System.out.println("Splited string:");
		System.out.println(word1);
		System.out.println(word2);
		System.out.println(word3);

	}

}
