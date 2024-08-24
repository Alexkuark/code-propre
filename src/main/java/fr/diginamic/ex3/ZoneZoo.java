package fr.diginamic.ex3;

import java.util.ArrayList;
import java.util.List;

public class ZoneZoo {

	private String nom;
	
	private List<Animal> animaux;
	
	private List<Alimentation> alimentations;
	
	private TypeAnimal type;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Animal> getAnimaux() {
		return animaux;
	}

	public void setAnimaux(List<Animal> animaux) {
		this.animaux = animaux;
	}
	
	public TypeAnimal getType() {
		return type;
	}

	public void setType(TypeAnimal type) {
		this.type = type;
	}

	public List<Alimentation> getAlimentations() {
		return alimentations;
	}

	public void setAlimentations(List<Alimentation> alimentations) {
		this.alimentations = alimentations;
	}

	public ZoneZoo() {
		this.animaux = new ArrayList<Animal>();
	}
	
	public ZoneZoo(String nom, List<Alimentation> alimentations, TypeAnimal type) {
		this();
		this.nom = nom;
		this.alimentations = alimentations;
		this.type = type;
	}
	
	public void addAnimal(Animal animal) {
		animaux.add(animal);
	}
	
	public String toString(){
		String afficher = this.getNom() + " :\n";
		for (Animal animal : animaux){
			afficher += animal + "\n";
		}
		return afficher;
	}
	
	public int compterAnimaux(){
		return animaux.size();
	}
	
	public double calculerKgsNourritureParJour() {
		return compterAnimaux() * this.getType().getQuantiteAlimentation();
	}

}
