package br.com.generation;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		/*3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
			das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.*/
		
			Scanner leia = new Scanner (System.in);
			//Entrada de variaveis
			int[][] N1 = new int[2][5];
			int[][] N2 = new int[2][5];
			int[][] M1 = new int [2][5];
			int[][] M2 = new int [2][5];
			//Interação com o usuario
			System.out.println("Digite os valores da matriz N1 ");
			for (int l = 0;l<N1.length;l++) {
				for (int c = 0;c<N1[l].length;c++) {
					//Interação com o usuario
					System.out.printf("Digite os valores na posição %d %d: " , l,c); 
					N1[l][c] = leia.nextInt();
					
				}
				System.out.println();
			}
			//Interação com o usuario
			System.out.println("Digite os valores da matriz N2 ");
			for (int l = 0;l<N2.length;l++) {
				for (int c = 0;c<N2[l].length;c++) {
					//Interação com o usuario
					System.out.printf("Digite os valores na posição %d %d: " , l,c); 
					N2[l][c] = leia.nextInt();
					
				}
				System.out.println();
			}
			leia.close();
			System.out.print("Matriz M1: \n");
			//para nossa condição ler a numero de linha e a largura
			for (int l = 0;l<M1.length;l++) {
				for (int c = 0;c<M1[l].length;c++) {
					M1[l][c] = N1[l][c] + N2[l][c];
				
					System.out.print( M1[l][c] + "|");
				}
			System.out.println();
			}
			//Interação com o usuario
			System.out.print("\nMatriz M2: \n");
			for (int l = 0;l<M2.length;l++) {
				for (int c = 0;c<M2[l].length;c++) {
					M2[l][c] = N1[l][c] - N2[l][c];
					System.out.print(M2[l][c] + "|");
				}
			System.out.println();
			}
		
		}

	}
