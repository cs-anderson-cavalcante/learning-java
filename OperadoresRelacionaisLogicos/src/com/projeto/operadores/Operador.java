package com.projeto.operadores;

public class Operador {

	/*
		OPERADORES RELACIONAIS
	=  (ATRIBUIÇÃO)
	== (IGUAL A)
	!= (DIFERENTE)
	>  (MAIOR QUE)
	<  (MENOR QUE)
	>= (MAIOR OU IGUAL)
	<= (MENOR OU IGUAL)
	
		OPERADORES LÓGICOS
	&& (E) - Usado para comparar dois valores booleanos ( ou seja, para ele retornar um valor TRUE, as duas condições precisam ser verdadeiras)
	|| (OU) - Usado para verificar se alguma de por exemplo 2 condições é verdadeira ( ou seja, para ele te retornar um valor true, alguma das duas condicçes precisam ser true, exemplo 1==1 || 2==6, uma das condições é true)

*/

public static void main(String[] args) {
	
				// OPERADOR IGUALDADE == \\
	//CRIANDO UMA VARIAVEL CHAMADA "IGUALDADE"
	//TESTANDO A VARIAVEL PARA SABER SE 5 REALMENTE É IGUAL A 3.
	//PRINTANDO NA TELA O VALOR DA VARIAVEL "IGUALDADE"
	boolean igualdade;
	igualdade = 5 == 5;
	System.out.println(igualdade);
	
	//CRIANDO UMA VARIAVEL CHAMADA "IGUALDADE2"
	//CRIANDO 2 VARIAVEIS DO TIPO INT COM VALORES
	//TESTANDO A VARIAVEL PARA SABER SE VALOR1 REALMENTE É IGUAL A VALOR2.
	//PRINTANDO NA TELA O VALOR DA VARIAVEL "IGUALDADE2"
	boolean igualdade2;
	int valor1=3;
	int valor2=3;
	igualdade2 = valor1 == valor2;
	System.out.println(igualdade2);
	
/*
 ******************************************************************************************* 	
 */
	
				// OPERADOR DIFERENTE != \\
	//CRIANDO UMA VARIAVEL CHAMADA "DIFERENTE"
	//TESTANDO A VARIAVEL PARA SABER SE 5 REALMENTE É DIFERENTE A 3.
	//PRINTANDO NA TELA O VALOR DA VARIAVEL "DIFERENTE"
	boolean diferente;
	diferente = 5 != 5;
	System.out.println(diferente);
	
	//CRIANDO UMA VARIAVEL CHAMADA "DIFERENTE2"
	//CRIANDO 2 VARIAVEIS DO TIPO INT COM VALORES
	//TESTANDO A VARIAVEL PARA SABER SE VALOR3 REALMENTE É DIFERENTE A VALOR4.
	//PRINTANDO NA TELA O VALOR DA VARIAVEL "DIFERENTE2"
	boolean diferente2;
	int valor3=3;
	int valor4=3;
	diferente2 = valor3 != valor4;
	System.out.println(diferente2);
	
/*
 * ******************************************************************************************* 	
 */
				// OPERADOR MAIOR >  e  MAIOR OU IGUAL >= \\
		//CRIANDO UMA VARIAVEL CHAMADA "MAIOR"
		//TESTANDO A VARIAVEL PARA SABER SE 6 REALMENTE É MAIOR QUE 5.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "DIFERENTE"
		boolean maior;
		maior = 6 > 5;
		System.out.println(maior);
		
		//CRIANDO UMA VARIAVEL CHAMADA "MAIOR2"
		//CRIANDO 2 VARIAVEIS DO TIPO INT COM VALORES
		//TESTANDO A VARIAVEL PARA SABER SE VALOR5 REALMENTE É MAIOR QUE VALOR6.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "MAIOR2"
		boolean maior2;
		int valor5=6;
		int valor6=5;
		maior2 = valor5 > valor6;
		System.out.println(maior2);
		
		
		//CRIANDO UMA VARIAVEL CHAMADA "MAIOR3"
		//TESTANDO A VARIAVEL PARA SABER SE 6 REALMENTE É MAIOR OU IGUAL 5.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "MAIOR3"		
		boolean maior3;
		maior3 = valor5 >= valor6;
		System.out.println(maior3);
		
/*
 * ******************************************************************************************* 	
 */
		
				// OPERADOR MENOR < e MENOR OU IGUAL <= \\
		//CRIANDO UMA VARIAVEL CHAMADA "MENOR"
		//TESTANDO A VARIAVEL PARA SABER SE 6 REALMENTE É MENOR QUE 5.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "MENOR"
		boolean menor;
		menor = 8 < 7;
		System.out.println(menor);
				
		//CRIANDO UMA VARIAVEL CHAMADA "DIFERENTE2"
		//CRIANDO 2 VARIAVEIS DO TIPO INT COM VALORES
		//TESTANDO A VARIAVEL PARA SABER SE VALOR7 REALMENTE É MENOR A VALOR8.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "MAIOR2"
		boolean menor2;
		int valor7=8;
		int valor8=7;
		menor2 = valor7 < valor8;
		System.out.println(menor2);
		
		//CRIANDO UMA VARIAVEL CHAMADA "MENOR3"
		//TESTANDO A VARIAVEL PARA SABER SE 8 REALMENTE É MENOR OU IGUAL 7.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "MENOR3"		
		boolean menor3;
		menor3 = valor7 <= valor8;
		System.out.println(menor3);
		
/*
 ****************************************************************************************** 	
 */
	
		// OPERADOR E && \\
		//CRIANDO UMA VARIAVEL CHAMADA "and"
		//TESTANDO A VARIAVEL PARA SABER SE AS CONDIÇÕES SÃO VERDADEIRAS.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "and"
		boolean and;
		and = 8==8 && 7==7;
		System.out.println(and);
		
		//CRIANDO UMA VARIAVEL CHAMADA "and2"
		//CRIANDO VARIAVEIS DO TIPO INT COM VALORES PARA TESTAR AS CONDIÇÕES.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "and2"
		boolean and2;
		int teste1=8;
		int teste2=7;
		int teste3=8;
		int teste4=7;
		and2 = teste1==teste3 && teste2==teste4;
		System.out.println(and2);
		
/*
 ****************************************************************************************** 	
*/
		
			
		// OPERADOR OU || \\
		//CRIANDO UMA VARIAVEL CHAMADA "OU"
		//TESTANDO A VARIAVEL PARA SABER SE AS CONDIÇÕES SÃO VERDADEIRAS.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "OU"
		boolean ou;
		ou = 8==1 || 7==1;
		System.out.println(ou);
				
		//CRIANDO UMA VARIAVEL CHAMADA "OU2"
		//CRIANDO VARIAVEIS DO TIPO INT COM VALORES PARA TESTAR AS CONDIÇÕES.
		//PRINTANDO NA TELA O VALOR DA VARIAVEL "OU2"
		boolean ou2;
		int teste5=8;
		int teste6=7;
		int teste7=8;
		int teste8=7;
		ou2 = teste5==teste6 || teste6==teste7;
		System.out.println(ou2);
				
/*
 ****************************************************************************************** 	
*/		

	}

}
