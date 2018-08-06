package com.exercicios.operadores2;
import java.util.Scanner;

public class MetrosCentimetrosConverter {

	// 5. Faça um Programa que converta metros para centímetros.
	
	public static void main(String[] args) {
		
		int metros = 0;
		int centimetros;
        Scanner entrada1 = new Scanner(System.in);
		
        
        System.out.println("Digite o valor em metros: ");
        metros = entrada1.nextInt();
        
        int conversao = metros * 100;
        
        System.out.println("O valor em centimetros equivale à: " + conversao);
	}

}
