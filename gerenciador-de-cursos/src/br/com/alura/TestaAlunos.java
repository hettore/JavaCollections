package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		// não garante uma ordem - Set não aceita elementos repetidos
		Collection<String> alunos = new HashSet<>();

		alunos.add("Rodrigo Turini");
		alunos.add("Alberto Souza");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Rennan Saggio");
		alunos.add("Mauricio Aniche");
		
		boolean pauloEstaMatriculado = alunos.contains("Rodrigo Turini");
		alunos.remove("Sergio Lopes");
		System.out.println(pauloEstaMatriculado);
		
		

		System.out.println(alunos);

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println(alunos.size());
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		List<String> alunosEmLista = new ArrayList<>(alunos);
		
		System.out.println(alunosEmLista);
		System.out.println(alunosEmLista.get(4));
	}
}
