package com.projeto.conta;

public class ClassePrincipal {

	public static void main(String[] args) {		
		Conta conta = new Conta();
		conta.depositar(100); //deposito de mais 100$, valor atual 200$
		conta.sacar(50);// 200 - 50 = 150$
		conta.minhaPropriedadeProtegida = "Anderson: ";
		System.out.println(conta.minhaPropriedadeProtegida + conta.retornarSaldo() );
	}

	
}
