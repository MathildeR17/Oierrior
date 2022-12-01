package jeuDeOie;

public class Journal {
	//Attributs
	private String message = null;
		
	//Constructeur
		
	//Méthodes
	/**
	 * 
	 * @param texte
	 */
	public void ajouterMessage(String texte) {
		this.message = message + texte + "\n";
	}
		
	public void afficherMessage() {
		System.out.println(this.message);
		this.message = null;
	}
}
