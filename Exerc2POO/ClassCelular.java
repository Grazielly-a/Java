
/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/

package Exerc2POO;

public class ClassCelular {
	
	private String modelo;
	private String cor;
	private String sitemaOperacional;
	private int espacoArmazenamento;
	
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
	public String getSitemaOperacional() {
		return sitemaOperacional;
	}
	public void setSitemaOperacional(String sitemaOperacional) {
		this.sitemaOperacional = sitemaOperacional;
	}
	public int getEspacoArmazenamento() {
		return espacoArmazenamento;
	}
	public void setEspacoArmazenamento(int espacoArmazenamento) {
		this.espacoArmazenamento = espacoArmazenamento;
	}
}
