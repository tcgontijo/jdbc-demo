package br.edu.iftm;

public class Conta {
	private int id;
	private String titular;
	private int numero, agencia;
	private double limite, saldo;

//Construtores
	public Conta(String titular, int numero, int agencia, double limite, double saldo) {
		super();
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
		this.limite = limite;
		this.saldo = saldo;
	}

	public Conta(int id, String titular, int numero, int agencia, double limite, double saldo) {
		super();
		this.id = id;
		this.titular = titular;
		this.numero = numero;
		this.agencia = agencia;
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

}
