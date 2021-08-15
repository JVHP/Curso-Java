package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Lista de string's
		List<String> list = new ArrayList<>();

		// adicionar elemento
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");

		// adicionar na posição que preferir
		list.add(2, "Marco");

		// ver tamanho da lista
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		// Remover elemento da lista comparando um valor
//		list.remove("Anna");

		// Remover elemento da lista com o index
//		list.remove(1);

		// Remover elemento de acordo com um predicado (predicato ex. (x -> x.charAt(0) == 'M'), ex. remover tds com a letra M
		list.removeIf(x -> x.charAt(0) == 'M');

		System.out.println(list.size());
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		//encontrar posição de um elemento
		System.out.println("IndexOf Bob: " + list.indexOf("Bob"));
		
		//procurar algo que não está na lista
		System.out.println("IndexOf Marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------------------------");
		
		//pegar só quem contém algum predicato, por exemplo so os que iniciam com A
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		//**o stream serve para poder utilizar predicados em uma Lista**
		//**o filter serve para filtrar, juntamente do stream, utilizando o predicado
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		//encontrar primeiro elemento da lista que atenda um certo predicado
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		//acha o primeiro com base no filtro, se não achar retorna null
		
		System.out.println(name);
		
		sc.close();
	}

}
