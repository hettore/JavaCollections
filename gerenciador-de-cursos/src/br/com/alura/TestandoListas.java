package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		//funcionamento de arraylist
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();

		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

		System.out.println(aulas);

		aulas.remove(0);

		System.out.println(aulas);

		//para cada aula dentro de aulas -> faça
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}

		//pega a aula no index escolhido na posição
		String primeiraAula = aulas.get(0);

		System.out.println("A primeira aula é: " + primeiraAula);

		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Aula : " + aulas.get(i));
		}

		System.out.println(aulas.size());

		aulas.forEach(aula -> {
			System.out.println("Percorrendo:");
			System.out.println("Aula" + aula);
		});
		
		//adiciona aula
		aulas.add("Aumentando nosso conhecimento");
		
		System.out.println(aulas);
		
		//ordenando em ordem alfabetica
		Collections.sort(aulas);
		System.out.println("Depois de ordenado");
		System.out.println(aulas);

		
		
		
	}

}
