package Exerc2POO;

public class ObjetoCelular {

	public static void main(String[] args) {
		ClassCelular c1 = new ClassCelular();
		
		c1.setModelo("Iphone 11 pro max");
		c1.setCor("Preto");
		c1.setSitemaOperacional("IOS 13");
		c1.setEspacoArmazenamento(512);
		
		System.out.println("Celular");
		System.out.println("\nModelo: "+c1.getModelo());
		System.out.println("\nCor: "+c1.getCor());
		System.out.println("\nSistema Operacional: "+c1.getSitemaOperacional());
		System.out.println("\nEspaço de Armazenamento em GB: "+c1.getEspacoArmazenamento());
	}
}
