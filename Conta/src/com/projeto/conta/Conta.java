package com.projeto.conta;

public class Conta {
	
	// criando atributos dentro da classe Conta
	private int numeroConta;

	private double saldo = 100; // armazena o saldo atual da conta em modo private.
	
	protected String minhaPropriedadeProtegida;
	
	public void depositar(double valorDepositar) {
		// o this é usado para acessar atributos ou metodos dentro da classe
		this.saldo = this.saldo + valorDepositar;
	} // ira encrementar o saldo
	
	public void sacar(double valorSacar) {
		this.saldo = this.saldo - valorSacar;

	}
	
	public double retornarSaldo() { //metodo usado para usarmos o metodo em outra classe 
		return this.saldo;
	}
}


