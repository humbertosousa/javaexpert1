package br.com.colecoes.principal;

import java.util.HashSet;
import java.util.Set;

public class TesteSet {

	public static void main(String[] args) {
		
		// Cria pelo pai e instancia pelo filho
		Set<String> lista = new HashSet<String>();
		lista.add("DBA");
		lista.add("ESTAGIARIO");
		lista.add("FULL STACK");
		lista.add("DBA");
		System.out.println("Original: " + lista);
		//System.out.println(lista.get(2));
		//Collections.sort(lista);
		/* For convencional
		for (int cont=0;cont<lista.size();cont++) {
			System.out.println("Cargo: " + lista.get(cont));
		}
		*/

		//foreach
		for (String cargo : lista) {
			System.out.println("Cargo: " + cargo);
		}
		
		
		
		
		

	}

}
