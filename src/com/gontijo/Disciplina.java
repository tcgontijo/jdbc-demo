package com.gontijo;

public class Disciplina {
	private int id, periodo;
	private String nome, professor, codigo_sala_classroom;

//Construtores
	public Disciplina(int id, int periodo, String nome, String professor, String codigo_sala_classroom) {
		super();
		this.id = id;
		this.periodo = periodo;
		this.nome = nome;
		this.professor = professor;
		this.codigo_sala_classroom = codigo_sala_classroom;
	}

	public Disciplina(int periodo, String nome, String professor, String codigo_sala_classroom) {
		super();
		this.periodo = periodo;
		this.nome = nome;
		this.professor = professor;
		this.codigo_sala_classroom = codigo_sala_classroom;
	}

	public Disciplina() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getCodigo_sala_classroom() {
		return codigo_sala_classroom;
	}

	public void setCodigo_sala_classroom(String codigo_sala_classroom) {
		this.codigo_sala_classroom = codigo_sala_classroom;
	}

//Getters and Setters	

}
