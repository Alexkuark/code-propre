package fr.diginamic.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZooApplication {

	public static void main(String[] args) {
		
		List<ZoneZoo> zones = new ArrayList<ZoneZoo>(Arrays.asList(
				new ZoneZoo("Savane Africaine", new ArrayList<Alimentation>(Arrays.asList(Alimentation.HERBIVORE)), TypeAnimal.MAMMIFERE),
				new ZoneZoo("Zone des Carnivores", new ArrayList<Alimentation>(Arrays.asList(Alimentation.CARNIVORE)), TypeAnimal.MAMMIFERE),
				new ZoneZoo("Ferme à Reptiles", new ArrayList<Alimentation>(Arrays.asList(Alimentation.CARNIVORE, Alimentation.HERBIVORE)), TypeAnimal.REPTILE),
				new ZoneZoo("Aquarium", new ArrayList<Alimentation>(Arrays.asList(Alimentation.CARNIVORE, Alimentation.HERBIVORE)), TypeAnimal.POISSON)
				));
		
		Zoo zoo = new Zoo("Thoiry", zones);
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.MAMMIFERE, Alimentation.HERBIVORE));
		zoo.addAnimal(new Animal("Zèbre", TypeAnimal.MAMMIFERE, Alimentation.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.MAMMIFERE, Alimentation.CARNIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.MAMMIFERE, Alimentation.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.POISSON, Alimentation.CARNIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.POISSON, Alimentation.CARNIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.REPTILE, Alimentation.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.REPTILE, Alimentation.CARNIVORE));
		
		System.out.println(zoo);
	}

}