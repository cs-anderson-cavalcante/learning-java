package com.exercicios.operadores2;

import java.util.Scanner;

public class AreaQuadradoCalculator {
    
    public static void menu(){
        System.out.println("\tEscolha a opção desejada para o calculo de área de um terreno");
        System.out.println("0. Fim");
        System.out.println("1. Em centimetros quadrados");
        System.out.println("2. Em metros quadrados");
        System.out.println("3. Com Base e Altura diferente");
        System.out.println("Opcao: ");
    }

    public static void cents(){
        System.out.println("Você entrou no método de calculo em centimetros quadrados.");  
        
        Scanner entradaValorCm = new Scanner(System.in);
        int resultadoCm = 0;
        System.out.println("Digite o valor em centimetros quadrados que voce deseja encontrar o valor da área: ");  
        resultadoCm  = entradaValorCm.nextInt();
        int valorFinal = resultadoCm * resultadoCm;
        System.out.println("O tamanho da área é: " + valorFinal );  
    }
    
    public static void mets(){
        System.out.println("Você entrou no método calculo em metros quadrados.");
        
        Scanner entradaValorMts = new Scanner(System.in);
        int resultadoMts = 0;
        System.out.println("Digite o valor em metros quadrados que voce deseja encontrar o valor da área: ");  
        resultadoMts  = entradaValorMts.nextInt();
        int valorFinalMts = resultadoMts * resultadoMts;
        System.out.println("O tamanho da área é: " + valorFinalMts );  
    }
    
    public static void dif(){
        System.out.println("Você entrou no método de calculo com base x altura diferente.");
        
        Scanner entradaValorBase = new Scanner(System.in);
        int resultadoBase = 0;
        System.out.println("Digite o valor da base: ");  
        resultadoBase  = entradaValorBase.nextInt();
        
        Scanner entradaValorAltura = new Scanner(System.in);
        int resultadoAltura = 0;
        System.out.println("Digite o valor da altura: ");  
        resultadoAltura  = entradaValorAltura.nextInt();
        
        int valorFinalDif = resultadoAltura * resultadoBase;
        System.out.println("O tamanho da área é: " + valorFinalDif );  
    }
    
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                cents();
                break;
                
            case 2:
                mets();
                break;
                
            case 3:
                dif();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
}