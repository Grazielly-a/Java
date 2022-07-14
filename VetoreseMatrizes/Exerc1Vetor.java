package VetoreseMatrizes;

import java.util.Scanner;

/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.*/

import java.util.Scanner;

public class Exerc1Vetor {

	public static void main(String[] args) {
		int vetor [] = new int [5],x,maiorPontuacao=0;		
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<5;x++)
		{			
			System.out.println("Digite suas pontuações: ");
			vetor[x]=leia.nextInt();
			if(vetor[x] > maiorPontuacao)				
			{
				maiorPontuacao = vetor[x];
			}					
		}		
		System.out.println("\nSua maior pontuação é: "+maiorPontuacao);
	}

}
