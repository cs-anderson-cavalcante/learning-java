package com.projeto.contrutores;

public class ConstrutorPrincipal {
	// Responsavel pela inicialização do nosso objeto;
	// Deve ter sempre o mesmo nome da classe;
	// Não permite retorno de valor
	// Não é obrigatório
	public static void main(String[] args) {

		Conta conta = new Conta(10023);
		conta.imprime();
	}

}
