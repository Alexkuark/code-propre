package fr.diginamic.ex3;

public enum TypeAnimal {
	
	MAMMIFERE("Mammifere", 10),
	REPTILE("Reptile", 0.1),
	POISSON("Poisson", 0.2);

	private String libelle;
	
	private double quantiteAlimentation;

	TypeAnimal(String nom, double quantite) {
		this.setLibelle(nom);
		this.setQuantiteAlimentation(quantite);
	}

	public String getLibelle() {
		return libelle;
	}

	private void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public double getQuantiteAlimentation() {
		return quantiteAlimentation;
	}

	public void setQuantiteAlimentation(double quantiteAlimentation) {
		this.quantiteAlimentation = quantiteAlimentation;
	}
	
	public String toString() {
		return this.getLibelle();
	}
}
