/*
******************************************************************************************************************************************************************************
										O Comando SWITCH

Colocamos várias opções e vários comandos dentro do comando switch, todas as possibilidades de nosso aplicativo ou todas as opções ou rumos que nossos programas possam tomar.

O switch vai funcionar como um interruptor, pois dependendo da entrada que você der a ele, ele vai acionar somente certo(s) comando(s) dentre os que você disponibilizou.

É como se você criasse um menu, ou cardápio, e com o switch você escolhesse o que vai querer.

*******************************************************************************************************************************************************************************

										Sintaxe do Comando Switch
 
 
switch( opção )
{
    case opção1:
            comandos caso a opção 1 tenha sido escolhida
            break;
    
    case opção2:
            comandos caso a opção 2 tenha sido escolhida
            break;
    
    case opção3:
            comandos caso a opção 3 tenha sido escolhida
            break;
    
    default:
            comandos caso nenhuma das opções anteriores tenha sido escolhida
}

Observação:
A variável 'opção' geralmente é um inteiro ou caractere (também pode ser byte ou short), que o usuário digita através da classe Scanner.
Se 'opção' receber 'opção1' como entrada, são os códigos contido na 'case opção1' que serão executados.
Se 'opção' receber 'opção2' como entrada, são os códigos contido na 'case opção2' que serão executados.
Se 'opção' receber 'opção3' como entrada, são os códigos contido na 'case opção3' que serão executados.
Se 'opção' receber qualquer outra coisa que não seja 'opção1', 'opção2' ou 'opção3', são os códigos contido em 'default' que serão executados.

******************************************************************************************************************************************************************************
										Exercicio

Vamos criar uma calculadora que faz as operações básicas usando o comando switch.
É um aplicativo Java simples que recebe 3 dados: dois números e um caractere.
Esse caractere poderá ser '+', '-', '*' ou '/' , e representarão a operação matemática que você deseja realizar entre os números. Vejamos:
 */


package com.projeto.loops;

import java.util.Scanner;

public class SwitchCommandSintaxe {

	public static void main(String[] args) {
	        float numero1, numero2;
	        char operacao;
	        Scanner entrada = new Scanner(System.in);
	        
	        System.out.print("Escolha sua operação [+ - * / ]: ");
	        operacao = entrada.nextLine().charAt(0);
	        
	        System.out.print("Entre com o primeiro número: ");
	        numero1 = entrada.nextFloat();
	        System.out.print("Entre com o segundo número: ");
	        numero2 = entrada.nextFloat();
	        System.out.println();
	        
	        switch( operacao )
	        {
	            case '+':
	                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
	                break;  
	                
	                /* 			
	                 	OBRSERVAÇÃO IMPORTANTE
Um ponto importante é a declaração para exibir os valores de float 
Formata com 2 casas depois da vírgula
System.out.printf ("O valor da ação é %.2f %n", 20.34); 
Formata ocupando 10 posições, sendo 2 casas depois da vírgula
System.out.printf ("O valor da ação é %10.2f %n", 20.34);
	                 */
	                
	            case '-':
	                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
	                break;
	                
	            case '*':
	                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
	                break;
	                
	            case '/':
	                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
	                break;
	            
	            default:
	                System.out.printf("Você digitou uma operação inválida.");        
	            
	        }

	}

}
