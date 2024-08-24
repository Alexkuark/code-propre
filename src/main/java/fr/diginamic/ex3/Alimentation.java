package fr.diginamic.ex3;

public enum Alimentation {
	
	CARNIVORE("Carnivore"),
	HERBIVORE("Herbivore"),
	OMNIVORE("Omnivore");

	private String libelle;

	Alimentation(String nom) {
		this.setLibelle(nom);
	}

	public String getLibelle() {
		return libelle;
	}

	private void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public String toString() {
		return this.getLibelle();
	}
}
