package com.projeto.operadoresbasicos;

public class Operador {
	
	/*
	 		OPERADORES
	 	Somar +
	 	Subtrair -
	 	Multiplicação *
	 	Divisião /
	 	Modulo % (resto da divisão, ou seja 11/2 = 1, ele é usado para descobrir os restos das divisões)
	 */

	public static void main(String[] args) {
		
		int primeiro = 11;
		int segundo = 2; 
		int resultado = 0;
		
		resultado = primeiro % segundo;
		System.out.println(resultado);

	}

}
