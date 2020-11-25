package com.gontijo;

import java.util.List;


public class Main {

	public static void main(String[] args) {
		DisciplinaDAO dao = new DisciplinaDAO();
		List<Disciplina> lista = dao.todos();
		
		for (Disciplina disciplina : lista) {
			System.out.println("Nome da Disciplina: " + disciplina.getNome());
		}
	}

}
