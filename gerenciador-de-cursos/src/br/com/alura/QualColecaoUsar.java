package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class QualColecaoUsar {

	public static void main(String[] args) {
		Collection<Aluno> alunos = new HashSet<>();
		Aluno a1 = new Aluno("Hettore", 123456);
		alunos.add(a1);
		System.out.println(a1);
	}
}
