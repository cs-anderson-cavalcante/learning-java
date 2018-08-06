/* 
 Suponha que você é um cientista e quer saber se entre os números 1 e um milhão existe um número que é múltiplo de 17 e 19, ao mesmo tempo.
Ou seja, queremos saber se existe um número entre 1 e um milhão que deixa resto 0 na divisão por 17 e por 19.
Caso exista, o imprima. E só imprima o menor
 Note uma coisa, queremos achar um número que seja múltiplo de 17 e 19. Ora, tal número não pode ser par, pois 17 e 19 são ímpares.
Para cada número 'count', estamos fazendo dois testes: se é múltiplo de 17 e se é múltiplo de 19.

Vamos otimizar da seguinte maneira, vamos fazer um só teste: vamos checar se é múltiplo de 2. Caso seja, nem adianta testar se é múltiplo de 17 e 19, podemos pular essa iteração.
E como pulamos uma iteração? Com o comando continue!

Veja como fica:

 */

package com.projeto.loops;

public class BreakContinueCommandSintaxe {

	public static void main(String[] args) {
		long i = System.currentTimeMillis();
        
        for(int count=1 ; count <=1000000 ; count++){
            if(count % 2 == 0){
                continue;
            }
            if((count % 17 == 0) && (count % 19 == 0)){
                System.out.println(count);
                break;
            }
            
        }
        System.out.println("Tempo de execução, em milisegundos: "+ (System.currentTimeMillis() -i));
	}

}
