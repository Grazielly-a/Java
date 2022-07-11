package LaçosdeRepetição;

/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. WHILE*/

import java.util.Scanner;

public class Exerc3Rep {

	public static void main(String[] args) {
		int idade,totalMenor21=0,totalMaior50=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade: ");
		idade= leia.nextInt();
		
		while(idade!=-99)
		{
			if(idade<21)
				totalMenor21++;
			if(idade>50)
				totalMaior50++;				
			System.out.println("Digite sua idade: ");
			idade= leia.nextInt();	
		}		
			
		System.out.println("O total de pessoas com menos de 21 anos é: "+totalMenor21);
		System.out.println("O total de pessoas com mais de 50 anos é: "+totalMaior50);
		
	}

}
