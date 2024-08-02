 package fr.diginamic.ex1;

import java.util.Date;

public class entreprise {

	/** siret : numero siret de l'entreprise */
	private int siret;
	/** nom : nom de l'entreprise */
	private String nom;
	/** adresse : adresse postale de l'entreprise */
	private String adresse;
	/** dateCreation : date de création de l'entreprise */
	private Date dateCreation;
	
	/** CAPITAL_MAX : valeur maximale autorisée du capital de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;
	
	/** Affiche le statut de l'entreprise
	 */
	public void afficherStatut(){
		
	}
	
	/** Getter for siret
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}
	/** Setter for siret
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
	}
	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/** Setter for nom
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/** Getter for adresse
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}
	/** Setter for adresse
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	/** Getter for dateCreation
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}
	/** Setter for dateCreation
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	/** Getter for CAPITAL_MAX
	 * @return the CAPITAL_MAX
	 */
	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}
	
}
