package br.com.generation;

import java.util.Scanner;
//2.	Um dado � lan�ado 10 vezes e o valor correspondente � anotado. Fa�a um programa que gere um vetor
//com os lan�amentos, escreva esse vetor. A seguir determine e imprima a m�dia
//aritm�tica dos lan�amentos, contabilize e apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		int soma = 0, Quan_pontuacao = 0, maior_pontuacao = 0, k = 0;
		int [] lancamentos = new int [10];
		double media = 0.d;
			
		 System.out.println("Digite o numero dos lan�amentos: ");
		 for(int i = 0; i < 10; i ++ ) {

			 System.out.println("O "+(i + 1)+  "� lan�amento �: ");
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
