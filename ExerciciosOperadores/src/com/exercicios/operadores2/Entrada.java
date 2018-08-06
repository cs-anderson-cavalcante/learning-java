package com.exercicios.operadores2;

import java.util.Scanner;
        
public class Entrada {

    public static void main(String[] args) {
    	
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);

        int valor1;
        int valor2;
        
        System.out.println("Digite hun número: ");
        valor1 = entrada1.nextInt();
        
        
        System.out.println("Digite outro número: ");
		valor2 = entrada2.nextInt();
        
		int valorFinal = valor1 + valor2;
        
        System.out.println("Sua soma é " + valorFinal);
        
    }
}