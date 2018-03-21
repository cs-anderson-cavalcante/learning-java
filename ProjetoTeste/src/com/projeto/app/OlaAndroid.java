// Classe pertencente ao pacote criado dentro da pasta SRC
package com.projeto.app;

// Classe criada pertencente ao package com.projeto.app
// Dentro das chaves, ficam as estruturas para execução dos nossos codidos (Ou seja, os metodos).
//		Public
// É o modificador de acesso do método.
// Usando este modificador o método pode ser acessado por qualquer classe dentro (e fora) do projeto.
// Outros modificadores são protected, private ou sem modificador.

public class OlaAndroid {
	
	//		main
	// É o nome do método. Todo e qualquer método precisa ter um nome.
	// Os nomes são definidos pelo programador e geralmente seguem algum padrão convencional definido previamente pela linguagem ou pela comunidade, embora isso seja opcional.
	// No caso do Java, a própria Oracle define estas convenções. No Java (e em outras linguagens também) o main é o ponto de entrada da aplicação.
	// É o método que a JRE procura para executar a aplicação. Por isso, em alguns tipos de aplicação (como Swing ou console) é obrigatório tê-lo implementado
	// Estrutura que será executada primeiro.
	public static void main(String[] args) {
		
		System.out.println( "Olá Java" );

	}

}
