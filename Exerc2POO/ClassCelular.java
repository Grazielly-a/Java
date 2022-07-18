
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package Exerc2POO;

public class ClassCelular {
	
	private String modelo;
	private String cor;
	private String sistemaOperacional;
	private int espacoArmazenamento;
	
	public ClassCelular (String modelo, String cor, String sistemaOperacional, int espacoArmazenamento)
	{
		this.modelo = modelo;
		this.cor = cor;
		this.sistemaOperacional = sistemaOperacional;
		this.espacoArmazenamento = espacoArmazenamento;
	}
	
	public void tipoCelular()
	{
		System.out.println("Celular"+"\nModelo: "+modelo+"\nCor: "+cor+"\nSistema Operacional: "+sistemaOperacional+"\nEspaço armazenamento em GB: "+espacoArmazenamento);
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getSistemaOperacional() {
		return sistemaOperacional;
	}
	public void setSitemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}
	public int getEspacoArmazenamento() {
		return espacoArmazenamento;
	}
	public void setEspacoArmazenamento(int espacoArmazenamento) {
		this.espacoArmazenamento = espacoArmazenamento;
	}
}
