package fr.diginamic.ex2;

public class LivretA extends Compte {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/** Ce constructeur est utilisé pour créer un compte de type Livret A
	 * @param solde représente le solde du compte
	 * @param tauxRemuneration  représente le taux de rémunération du livret A
	 */
	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.setTauxRemuneration(tauxRemuneration);
	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > 0){
			super.debiterMontant(montant);
		}
	}
	
	public double calculerRemuAnnuelle(){
		return this.getSolde()*tauxRemuneration/100;
	}
	
	public void appliquerRemuAnnuelle(){
		this.setSolde(this.getSolde() + this.calculerRemuAnnuelle());
	}

}
