package Exerc1POO;

public class ObjetoCliente {

	public static void main(String[] args) {
		ClassCliente cliente1 = new ClassCliente("Antônio Melo","Maculino","345.567.122-99","13/09/1976","Dinheiro");
		
		cliente1.cadastroCliente();
		cliente1.formaPagamento();		
		
	}
}
