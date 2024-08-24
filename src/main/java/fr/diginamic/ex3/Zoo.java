package fr.diginamic.ex3;

import java.util.List;

public class Zoo {

	private String nom;
	private List<ZoneZoo> zones;
	
	public Zoo(String nom, List<ZoneZoo> zones) {
		this.nom = nom;
		this.zones = zones;
	}
	
	public void addAnimal(Animal animal){
		for (ZoneZoo zone : zones) {
			if (zone.getType().equals(animal.getType()) && zone.getAlimentations().contains(animal.getComportement())) {
				zone.addAnimal(animal);
			}
		}
	}
	
	public String toString(){
		String afficher = this.getNom() + " :\n";
		for (ZoneZoo zone : zones) {
			afficher += zone;
		}
		return afficher;
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<ZoneZoo> getZones() {
		return zones;
	}

	public void setZones(List<ZoneZoo> zones) {
		this.zones = zones;
	}
}