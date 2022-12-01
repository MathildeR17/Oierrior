package jeuDeOie;

import jeuDeOie.Case;
import jeuDeOie.De;
import jeuDeOie.Journal;
import jeuDeOie.Plateau;

public class Oie {
	//Attributs
		private String couleur;
		private Plateau plateau;
		private De de;
		private Case cases;
		private Journal journal;
		
		//Constructeur
		public Oie(String s, Plateau p, De des) {
			this.couleur = s;
			this.plateau = p;
			this.de = des;
		}
		
		//Méthodes
		/**
		 * 
		 * @return the plateau
		 */
		public Plateau getPlateau() {
			return this.plateau;
		}
		
		/**
		 * 
		 * @return the couleur
		 */
		public String getCouleur() {
			return this.couleur;
		}

		/**
		 * 
		 * @return de type boolean
		 */
		public boolean action() {
			cases.depart(this);
			journal.afficherMessage();
			
			return (cases.getNom().equals("numero 63")); 
		}
		
		/**
		 * 
		 * @return the valeurDes
		 */
		public int lancerDe() {
			int valeurDes = de.lancer() + de.lancer();
			ajouterMessage("la velur des dés fait " + valeurDes);
			return valeurDes;
		}
		
		/**
		 * 
		 * @param message
		 */
		public void ajouterMessage(String message) {
			journal.ajouterMessage(message);
		}
}
