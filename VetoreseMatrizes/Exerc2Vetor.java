package VetoreseMatrizes;

/*Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
imprima a média aritmética dos lançamentos, contabilize e apresente também
quantas foram as ocorrências da maior pontuação.*/

import java.util.Scanner;

public class Exerc2Vetor {

	public static void main(String[] args) {
		int vetor [] = new int [10], lancamento,somaLancamento=0,mediaLancamento=0,maiorPontuacao=0;
		Scanner leia = new Scanner(System.in);
		
		for(lancamento=0;lancamento<10;lancamento++)
		{
			System.out.println("Jogue o dado: ");
			vetor[lancamento]=leia.nextInt();
			while(vetor[lancamento]<1 || vetor[lancamento]>6)
			{
				System.out.println("\nJogue o dado novamente!");
				vetor[lancamento]=leia.nextInt();
			}
			somaLancamento = somaLancamento + vetor[lancamento];
			if(vetor[lancamento]==6)
			{
				maiorPontuacao++;
			}
		}
		mediaLancamento = somaLancamento/10;
		
		System.out.println("\nA média de lançamentos é: "+mediaLancamento);
		System.out.println("\nA quantidade de ocorrências com maior pontuação foi: "+maiorPontuacao);
	}

}
