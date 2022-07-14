package Exerc1POO;

public class ObjetoCliente {

	public static void main(String[] args) {
		ClassCliente cliente1 = new ClassCliente();
		
		cliente1.setNome("Antônio Melo"); 
		cliente1.setSexo("Maculino");
		cliente1.setCpf("345.567.122-99");
		cliente1.setDataNascimento("13/09/1976");
		cliente1.setPaga("Dinheiro");
		
		
		System.out.println("Cliente");		
		System.out.println("Nome: "+cliente1.getNome());
		System.out.println("Sexo: "+cliente1.getSexo());
		System.out.println("CPF: "+cliente1.getCpf());
		System.out.println("Data de Nascimento: "+cliente1.getDataNascimento());		
		System.out.println("Pagamento em: "+cliente1.getPaga());		
	}
}
