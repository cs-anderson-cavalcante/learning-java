package com.projeto.loops;

public class LoopsPrincipal {

	public static void main(String[] args) {
		
		//			Loops WHILE, DO WHILE e FOR
		
		// WHILE, no caso do while, ele está testando se a variavel numero é menor que 11 se for, ele vai printar pra mim na tela o valor de numero até 11
		// Se o numero for maior, ele não printará nada
		int numero=0;
		while( numero < 11 ) {
		System.out.print(numero + "Loop");
		numero = numero +1; // ou numero++ funciona tbm.
		
		do{ // ele executará o que está dentro das chaves primeiro e depois testará as condiçøes do WHILE
			System.out.print("Loop: " + numero);
			numero++;
		  }
		while ( numero < 0);
		
		for(int n=1; n <=6 ; n++ ) {
		System.out.print("Loop: " + n );
		}

	}
 }
}

