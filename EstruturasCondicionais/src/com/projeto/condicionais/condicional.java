package com.projeto.condicionais;

public class condicional {

	public static void main(String[] args) {
		
		//			OPERADOR IF  e ELSE e ELSE IF
		// Usado para testar condições.
		// Criando 2 variáveis
		// Atribuindo o valor da variavel soma, à soma das duas variaveis criadas à cima		// Testando para ver se soma é igual a dois, se sim printa "Verdadeiro", se não, não printa "Falso.
		int v1=3;
		int v2=1;
		int soma = v1+v2;
		if( soma==6 ){
			System.out.println("Aprovado");	
		} else if( soma > 6 ){
				System.out.println("Aprovado com Louvor");	
		} else if (soma < 6) {
			System.out.println("Reprovado");	
		 	}
		}
	}	

