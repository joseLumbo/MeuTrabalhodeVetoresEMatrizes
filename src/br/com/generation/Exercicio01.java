package br.com.generation;

import java.util.Scanner;
//2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor
//com os lançamentos, escreva esse vetor. A seguir determine e imprima a média
//aritmética dos lançamentos, contabilize e apresente também quantas foram as ocorrências da maior pontuação.

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int soma = 0, Quan_pontuacao = 0, maior_pontuacao = 0, k = 0;
		int [] lancamentos = new int [10];
		double media = 0.d;
			
		 System.out.println("Digite o numero dos lançamentos: ");
		 for(int i = 0; i < 10; i ++ ) {

			 System.out.println("O "+(i + 1)+  "º lançamento é: ");
			 lancamentos [i] = leia.nextInt();
			  
			 soma = soma + lancamentos[i];
			 
			 if(lancamentos[i] > maior_pontuacao) {
				 maior_pontuacao = lancamentos[i];
				 
			 }
			 k = i;
		}
		 media = soma / (k + 1);
	     System.out.println("Total da media foi: " + media);
	     leia.close();

  }
}
