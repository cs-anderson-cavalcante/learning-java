package com.projeto.variaveisjava;

public class Variavel {
	
	/* 
	
	Byte - armazena numeros (-128 até 127)
	int - armazena numeros (quase infinitos)
	long - armazena numeros tbm (mais do que o int)
	
	float - armazena numeros decimais (numeros com ponto, exemplo, 10.3
	double - armazena numeros decimais com mais precisão que o float
	
	boolean - recebe apenas true ou false
	
	String - armazena textos
	
	 */
	

	public static void main(String[] args) {
		
		//Atribuindo valor a variável criada
		byte minhaVariavelByte = 12;
		int minhaVariavelInt = 75643243;
		long minhaVariavelLong = 248762849;
		
		float minhaVariavelFloat = 1.23456789f;
		double minhaVariavelDouble = 1.12345567890;
		
		boolean minhaVariavelBoolean = false;
		
		String minhaVariavelString = "café com bolacha ";
		
		
		System.out.println(minhaVariavelByte);
		System.out.println(minhaVariavelInt);
		System.out.println(minhaVariavelLong);
		System.out.println(minhaVariavelFloat);
		System.out.println(minhaVariavelDouble);
		System.out.println(minhaVariavelBoolean);
		System.out.println(minhaVariavelString);
		//Printando na tela o valor de 2 variaveis
		System.out.println(minhaVariavelString + minhaVariavelByte);
		

	}

}
