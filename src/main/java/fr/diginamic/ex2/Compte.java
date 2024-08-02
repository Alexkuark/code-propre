package fr.diginamic.ex2;

public abstract class Compte {
	
	/** solde : solde du compte */
	private double solde;
	
	/**
	 * @param solde
	 */
	public Compte(double solde) {
		this.setSolde(solde);
	}
	
	/** Getter for solde
	 * @return the solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter for solde
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.setSolde(this.getSolde() + montant);
	}
	
	/** Retire un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
		this.setSolde(this.getSolde() - montant);
	}
	
}
