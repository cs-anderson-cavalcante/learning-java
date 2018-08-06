package com.exercicios.loopfor;

import java.util.Scanner;

public class ProgramaDaXuxa {

	public static void main(String[] args) {		

        System.out.println("Digite 3 valores: \n");  
        
        Scanner entradaV1 = new Scanner(System.in);
        int v1 = entradaV1.nextInt();
        Scanner entradaV2 = new Scanner(System.in);
        int v2 = entradaV2.nextInt();
        Scanner entradaV3 = new Scanner(System.in);
        int v3 = entradaV3.nextInt();
        
        int maior;
        int menor;
        
        
        if ((v1 >v2) && (v1 >v3)) {
        			maior = v1;
                    System.out.println("O Valor maior é: " + maior); 
        if (v2>v3) {
  			menor = v2;
			System.out.println("O Valor menor é: " + menor);  
      }
    }
  }
}

			



/* if ( condição ){
    caso a condição seja verdadeira
    esse bloco de código será executado
    
     Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. Consegue criar mais de uma solução?
     
     if ( (v1 <=v2) && (v1 <3) && (v2 >3) ){
            		System.out.println("seu numero maior:  " + v1);
        			System.out.println("seu numero menor:  " + v2);
    
    (v2 <=v1) && (v2 <=v3) && (v3 <=v1) && (v3 <=v2
    
} */


