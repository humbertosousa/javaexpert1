package br.com.colecoes.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TesteLista {

	public static void main(String[] args) {
		/*int[] numeros = new int[999];
		int indice=0;
		numeros[indice] = 50;
		indice++;
		numeros[indice] = 38;
		indice++;
		numeros[indice] = 17;
		System.out.println(numeros[1]);
		 * Caracter?sticas da manipula??o de vetores:
		 * - seu tamanho ? est?tico
		 * - precisa de um recurso para representar o indice
		 * - os dados s?o homogeneos (TODOS s?o do mesmo tipo)
		 * - n?o d? para eliminar uma posi??o em tempo de execu??o
		 * - ordena??o D? trabalho!!!!
		 */
		List<String> lista = new ArrayList<String>();
		lista.add("DEV");
		lista.add("ESTAGIARIO");
		lista.add("ANALISTA");
		lista.add("GERENTE DE PROJETO");
		lista.add("DBA");
		lista.add("DBA");
		System.out.println(lista);
		System.out.println("Segundo elemento: " + lista.get(1));
		lista.remove(2);
		System.out.println("Depois de excluir: " + lista);
		Collections.sort(lista);
		System.out.println("Ordenada:" + lista);
		
		int contDBA=0;
		for (int cont=1;cont<lista.size();cont+=2) {
			System.out.println("Cargo: " + lista.get(cont));
			if (lista.get(cont).toUpperCase().equals("DBA")) {
				contDBA++;
			}
		}
		System.out.println("Total de DBA?s: " + contDBA);
		

		
		
		
		
		

	}

}
