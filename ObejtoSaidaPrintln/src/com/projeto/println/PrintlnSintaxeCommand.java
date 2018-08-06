/*
 								INDICADORES DE FORMATO USANDO printf
Os especificadores de formato são como marcadores de lugares para um valor, especificando o tipo da saída dos dados que iniciam com 
um sinal de porcentagem (%) seguido por um caractere representando seu tipo de dado.

Na tabela abaixo alguns especificadores de formato:

%d	representa números inteiros
%f	representa números floats
%2f	representa números doubles
%b	representa valores booleanos
%c	representa valores char

								RESUMO
System.out.println - Insere uma nova linha, deixando o marcador posicionado na linha abaixo.
System.out.print - Mantém o cursor na mesma linha. Geralmente são utilizadas sequências de escape para pular uma linha.
System.out.printf - Especifica o formato da entrada do tipo de valor, que deve ser o mesmo tipo de dados apontado na instrução. 

 */

package com.projeto.println;

public class PrintlnSintaxeCommand {

	public static void main(String[] args) {
		linhaSimplesPrintln();
		linhaEmBaixoPrintln();
		linhaTabuladaPrintln();
		linhaBarraInvertidaPrintln();
		linhaAspasDuplasPrintln();
		posicaoNomePrintf();
		posicaoNumeroPrintf();
		
		
	}

	public static void linhaSimplesPrintln() {
		System.out.println("Esse é meu texto com linha simples.");
	}
	
	public static void linhaEmBaixoPrintln() {
		System.out.println("**Esse é meu texto \ncom linha em baixo.**");
	}
	
	public static void linhaTabuladaPrintln() {
		System.out.println("\tEsse é meu texto \tcom linha tabulada.");
	}
	
	public static void linhaBarraInvertidaPrintln() {
		System.out.println("\\ \\ \\ \\ Esse é meu texto com barra invertida.");
	}

	public static void linhaAspasDuplasPrintln() {
		System.out.println("\"texto com aspas duplas\"");
	}
	
	public static void posicaoNomePrintf() {
        // Onde %s, é um marcador de lugar para uma String
        System.out.printf("%s\n %s\n", "Marcela", "Nogueira");
	}
	public static void posicaoNumeroPrintf() {
        int num1 = 10;
        int num2 = 30;  
        // Onde %d, é um marcador de lugar para um numero INTeiro
        System.out.printf("Soma das variáveis num1 e num2 = %d",(num1 + num2));
	}
}
