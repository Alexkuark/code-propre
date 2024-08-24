package fr.diginamic.ex3;

public class Animal {
	
	private TypeAnimal type;
	private String nom;
	private Alimentation comportement;

	public Animal() {}
	
	public Animal(String nomAnimal, TypeAnimal typeAnimal, Alimentation comportement) {
		this.setType(typeAnimal);
		this.setNom(nomAnimal);
		this.setComportement(comportement);
	}

	public TypeAnimal getType() {
		return type;
	}

	public void setType(TypeAnimal type) {
		this.type = type;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Alimentation getComportement() {
		return comportement;
	}

	public void setComportement(Alimentation comportement) {
		this.comportement = comportement;
	}
	
	public String toString() {
		return this.getNom();
	}

}
