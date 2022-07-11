package LaçosdeDecisão;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este
//número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
//ímpar exiba o número elevado ao quadrado.

import java.util.Scanner;

public class Exerc4Decisão {

	public static void main(String[] args) {
		int num;
		double valor;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num=leia.nextInt();
		
		if(num % 2 == 0)
		{
			System.out.println("Número par!");
			valor = Math.sqrt(num);
		}
		else
		{
			System.out.println("Número ímpar!");
			valor = Math.pow(num, 2);
		}
		
		System.out.printf("\nValor: %f",valor);
	}

}
