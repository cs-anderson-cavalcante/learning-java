/*
 										DEFINIÇÃO

O Comando return; é utilizado para retornar o valor de uma condição dada dentro de um method.
Lembrando que um method pode sim retornar um valor (declarando ele int, float, char, boolean e afins), através do comando return.
Em outros casos, quando declaramos um method void, ele nao retorna nada, apenas executa o que tem dentro do method.

Dadas as condições dentro do meu method, ele trata as condições, através do comando return, ele retorna o resultado das condições, onde conseguiremos aplica-las em qualquer lugar do código.
 */

package com.projeto.loops;

public class ReturnCommandSintaxe {
	
    public static int soma(){ // exemplo de metodo passando argumento.
        return 1+1; //argumento
    }
    
    public static String mensagem() {
    		return "Resultado do method mensagem + resultado do method soma:  ";
    }

	public static void main(String[] args) { // exemplo de metodo usando apenas o retorno do metodo
		 System.out.print("Declarando a variável 'res_soma' e recebendo o método soma(): ");
	        int res_soma=soma();
	        System.out.println(res_soma);
	        
	        System.out.println("Imprimindo diretamente o resultado do return: " + soma());
	        
	        System.out.println("Usando em uma soma: 2 + soma() = " + (2 + soma()));
	        
	        System.out.println("Usando em um produto: 3 * soma() = " + (3 * soma()));
	        
	        System.out.println(mensagem() + soma());

	}

}
