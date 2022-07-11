package LaçosdeRepetição;

/*Escrever um programa que receba vários números inteiros no teclado. E no
final imprimir a média dos números múltiplos de 3. Para sair digitar
0(zero). DO WHILE*/

import java.util.Scanner;

public class Exerc6Rep {

	public static void main(String[] args) {
		int soma=0,cont=0,x;
		Scanner leia = new Scanner(System.in);
		
		do
		{
			System.out.println("Digite um número: ");
			x=leia.nextInt();
			if(x%3==0 && x!=0)
			{
				soma = soma + x; 
				cont++;
			}
		}
		while(x!=0);
		
		System.out.println("\nA média dos múltiplos de 3 é: "+soma/cont);
	}

}
