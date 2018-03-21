package com.projeto.classes;

public class ClassePrincipal {

	// Classe x Objetos
	// Classes são como templates, como por exemplo, uma planta de uma casa
	// Objetos é a casa, por exemplo, a janela a porta e a cor são atributos de um objeto, 
	// Metodos são as açoes que podem ser tomadas, por exemplo, abrir janela, abrir portão, apagar luz.
	// CLASSE: planta de casa; OBJETO: casa; ATRIBUTOS: portão, janela; METODO: abrir janela, abrir portão.
	
	public static void main(String[] args) {
		
		// instanciando/associando uma classe para dentro de uma variavel
		Casa minhaCasa = new Casa();
		// Colocando um "."ponto no final do nome da varivel ("minhaCasa.") podemos ver todos os metodos e atributos disponivel dentro do objeto Casa
		minhaCasa.cor = "Azul";
		System.out.println(minhaCasa.cor);
		
		minhaCasa.abrirGaragem();
	}

}
