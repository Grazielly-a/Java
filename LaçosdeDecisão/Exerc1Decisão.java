package LaçosdeDecisão;

//Faça um programa que é três inteiros e diga qual deles.

import java.util.Scanner;

public class Exerc1Decisão {

	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número: ");
		num1=leia.nextInt();
		System.out.println("\nEntre com o segundo número: ");
		num2=leia.nextInt();
		System.out.println("\nEntre com o terceiro número: ");
		num3=leia.nextInt();
		
		if(num1 > num2 && num1 > num3)
		{
			System.out.println("\nO maior número é: "+num1);
		}
		else if(num2 > num3)
		{
			System.out.println("\nO maior número é: "+num2);
		}
		else
		{
			System.out.println("\nO maior número é: "+num3);
		}
	}

}
