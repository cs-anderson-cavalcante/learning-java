package com.projeto.loops;

import java.util.Scanner;

public class DoWhile {

	public static int quadrado(int num){
        int quadrado;
        quadrado = num * num;
        return quadrado;
    }
    
    public static void main(String[] args) {
        int numero, numero_quadrado;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Entre com um inteiro: ");
        numero = entrada.nextInt();
        
        numero_quadrado=quadrado(numero);
        
        System.out.printf("%d elevado ao quadrado é %d %d", numero, numero_quadrado);	}

}

//    no operador DO ele executa o que tem dentro das chaves, e depois faz a verificação da condição.
