/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

package Exerc1POO;

public class ClassCliente {
	private String nome;
	private String sexo;
	private String cpf;
	private String dataNascimento;
	private String paga;
	
	//Metodo especial construtor 
	 public ClassCliente (String nome, String sexo, String cpf, String dataNascimento, String paga)
	 {
		 this.nome = nome;
		 this.sexo = sexo;
		 this.cpf = cpf;
		 this.dataNascimento = dataNascimento;
		 this.paga = paga;
	 }
	 
	 public void cadastroCliente()
	 {
		 System.out.println("Cadastro Cliente!"+"\nNome: "+nome+"\nSexo: "+sexo+"\nCpf: "+cpf+"\nData de Nascimento: "+dataNascimento);
	 }
	 public void formaPagamento()
	 {
		 System.out.println("\nPagamento em: "+paga);
	 }
		

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getPaga() {
		return paga;
	}

	public void setPaga(String pagamento) {
		this.paga = pagamento;
	}	
}
