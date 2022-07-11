package LaçosdeRepetição;

/*Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5. FOR */

import java.util.Scanner;

public class Exerc1Rep {

	public static void main(String[] args) {
		int x;
		Scanner leia = new Scanner(System.in);
		
		for(x=1000;x<=1999;x++)
		{
			if(x % 11 == 5)
			{
				System.out.println("\n "+x);				
			}
		}
	}
}
