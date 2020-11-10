package br.edu.iftm;

public class Conta {
	private String titular;
	private int id, agencia, numero;
	private double limite, saldo;
	

//Construtores
	public Conta(String titular, int agencia, int numero, double limite, double saldo) {
		super();
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldo;
	}

	public Conta(int id, String titular, int agencia, int numero, double limite, double saldo) {
		super();
		this.id = id;
		this.titular = titular;
		this.agencia = agencia;
		this.numero = numero;
		this.limite = limite;
		this.saldo = saldo;
	}
	
	public Conta() {
		super();
	}
//Getters
	public String getTitular() {
		return titular;
	}

	public int getId() {
		return id;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getLimite() {
		return limite;
	}

	public double getSaldo() {
		return saldo;
	}
//Setters
	public void setId(int id) {
		this.id = id;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



}
