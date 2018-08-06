package com.exercicios.operadores2;

import java.util.Scanner;
        
public class NotasBimestrais {

    public static void main(String[] args) {
    	
    	/*  4. Faça um Programa que peça as 4 notas bimestrais e mostre a média.*/
    	
        Scanner entrada1 = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        Scanner entrada3 = new Scanner(System.in);
        Scanner entrada4 = new Scanner(System.in);

        int nota1;
        int nota2;
        int nota3;
        int nota4;
        
        
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada1.nextInt();
        
        System.out.println("Digite a segunda  nota: ");
		nota2 = entrada2.nextInt();
		
        System.out.println("Digite a terceira nota: ");
		nota3 = entrada3.nextInt();
		
        System.out.println("Digite a quarta nota: ");
		nota4 = entrada4.nextInt();
        
		int somaNotas =  nota1 + nota2 + nota3 + nota4;
		int mediaFinal = somaNotas / 4;

		
        System.out.println("Sua média é " + mediaFinal);
        
    }
}