package br.com.generation;

import java.util.Scanner;
//4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
//e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
public class Exemplo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
        int[][]m3 = new int [3][3];
        int soma_total = 0;
        int soma_diagonal = 0;



        for( int l = 0;l < m3.length;l++) {
            for( int c = 0;c < m3[l].length;c++) {
                System.out.println("Digite os valores da matriz");
                m3[l][c] = leia.nextInt();
                soma_total = soma_total+m3[l][c];

            }
            System.out.println();
        }

        for(int i = 0;i<3;i++) {
            soma_diagonal = soma_diagonal+ m3[i][i];

        }
        System.out.println("O valor total da matriz é: " + soma_total);
        System.out.println("O valor da soma da diagonal é: " + soma_diagonal);

        leia.close();

  
	}

}
