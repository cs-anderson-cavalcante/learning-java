/*
										DEFINIÇÃO
Metodo, é um grupo de código que faz uma determinada operação
Vantagem de usar metodos é o reaproveitamento de código e a organizaão
Em vez de criar um método que constrói uma casa, crie um método que cria um quarto, outro método que cria a sala, outro que cria o banheiro, um método pra organizar a casa etc.
Assim, quando tiver que criar um banheiro, já terá o método específico para aquilo.
Veja os métodos como peças de um quebra-cabeça. Porém, são peças 'coringa', que se encaixam com muitas outras peças.


 */

package com.projeto.metodos;

public class Metodos {
	
	// Grupo de código que faz uma determinada operação por exemplo:
	// método público (public) e não irá retornar nada (void)
	public static void main(String[] args) { // main = metodo principal DEFAULT, ele que será executado primeiro dentro da nossa aplicação.
		// printando os argumentos do metodo criado abaixo
		// para chamar um metodo crido após o metodo principal é só fazer assim:
		meuMetodo(); // usado para chamar um metodo criado		
		// aproveitando o resultado do retorno ( return resultado) do metodo multiplicar,
		// criando uma variavel e atribuindo a ela o resultado do metodo multiplicar
		// printando na tela o valor da variavel
		int resultadoFinal;
		resultadoFinal = multiplicar(2,5);
		System.out.println( resultadoFinal + "  ESSE É O RESULTADO FINAL DA MINHA VARIAVEL CRIADA NO METODO main QUE RECEBE O VALOR DO METODO multiplicar");
	}
	
	// criando um novo metodo do tipo void (vazio), ou seja é uma metodo que  nao ira retornar nada, exibe direto o que precisamos
	public static void meuMetodo() {
		System.out.println("Esse é meu metodo");
	}
	
	// criando um novo metodo int, e criando um retorno para reaproveitar o resultado

	public static int multiplicar (int numero1, int numero2) {
		int resultado = 0;
			resultado = numero1 * numero2;
			return resultado;
	}
	

}
