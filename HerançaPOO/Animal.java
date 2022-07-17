package HerançaPOO;

public abstract class Animal {
	
	private String tipoAnimal;
	
	public Animal (String tipoanimal) {
		this.tipoAnimal = tipoanimal;
	}
	
	abstract public void Nome (String nomeanimal);
	abstract public void Idade (int idadeanimal);
	abstract public void Som (String somanimal);

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
}
