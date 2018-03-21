package com.projeto.contrutores;

public class Conta {
	private int numeroConta;
	private double saldo;
	
	// Preparando o objeto para ser usado, ou seja, instanciando a classe conta.

	public Conta(int nConta) {
		this.numeroConta = nConta;
	}
	
		public void imprime () {
			System.out.println(this.numeroConta);
		}
	
}
