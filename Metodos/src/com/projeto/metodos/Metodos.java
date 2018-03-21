package com.projeto.metodos;

public class Metodos {
	
	// Grupo de código que faz uma determinada operação por exemplo:
	public static void main(String[] args) { // metodo principal DEFAULT
		// printando os argumentos do metodo criado abaixo
		// para chamar um metodo crido após o metodo principal é só fazer assim:
		int resultado;
		resultado = multiplicar(2,5);
		System.out.println(resultado + 5);

	}
	
	// criando um novo metodo do tipo void (vazio), ou seja é uma metodo que  nao ira retornar nada, exibe direto o que precisamos
	public static void meuMetodo() {
		System.out.println("Esse é meu metodo");
	}
	
	// criando um novo metodo int, e criando um retorno para reaproveitar o resultado

	public static int multiplicar (int numero1, int numero2) {
		int resultado = 0;
			resultado = numero1 * numero2;
			return resultado;
	}
	

}
