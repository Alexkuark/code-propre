package fr.diginamic.ex2;
/** Représente un compte bancaire de type compte courante (type=CC) ou livret A (type=LA)
 * @author DIGINAMIC
 */
public class CompteBancaire extends Compte {

	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;
	
	/** Ce constructeur est utilisé pour créer un compte de type Compte Courant
	 * @param solde représente le solde du compte
	 * @param decouvert  représente le découvert autorisé
	 */
	public CompteBancaire(double solde, double decouvert) {
		super(solde);
		this.decouvert = decouvert;
	}
	
	/** Getter for decouvert
	 * @return the decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}
	
	public void debiterMontant(double montant){
		if (this.getSolde() - montant > this.getDecouvert()){
			super.debiterMontant(montant);
		}
	}
}
