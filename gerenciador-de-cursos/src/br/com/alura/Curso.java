package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {

	private String name;
	private String instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	
	public Curso(String name, String instrutor) {
		this.name = name;
		this.instrutor = instrutor;
	}
	
	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	
	public String getName() {
		return name;
	}
	
	public String getInstrutor() {
		return instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}
	
	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}
	
	@Override
	public String toString() {
		return "[Curso: " + getName() + ", tempo total: " + this.getTempoTotal() + ","
				+ "aulas: " + this.aulas + "]";
	}
	
}
