package jeuDeOie;

import jeuDeOie.Case;
import jeuDeOie.De;
import jeuDeOie.Oie;
import jeuDeOie.Plateau;

public class Case {
	//Attributs
		private int numCase;
		private De de = new De();
		private Plateau plateau = new Plateau();
		
		//Constructeur
		public Case(int numCase) {
			this.numCase = numCase ;
		}

		//Méthodes
		/**
		 * 
		 * @return de type String
		 */
		public String getNom() {
			return(" numéro " + this.numCase);
		}
		
		/**
		 * 
		 * @param oie
		 * @return caseSuivante(Oie, int)
		 */
		public Case depart(Oie oie) {
			oie.ajouterMessage("L'oie " + oie.getCouleur() + " est sur la case " + this.getNom());
			int valeurDes = oie.lancerDe();
			
			return caseSuivante(oie, valeurDes + this.numCase - 1); //casePlateau
			
		}
		
		/**
		 * 
		 * @param oie
		 * @param numCaseDestination
		 * @return arrivee(Oie)
		 */
		private Case caseSuivante(Oie oie, int numCaseDestination) {
			oie.getPlateau();
			plateau.donnerCase(numCaseDestination);
			
			return arrivee(oie); //caseArrivee
			
		}
		
		/**
		 * 
		 * @param oie
		 * @return this
		 */
		private Case arrivee(Oie oie) {
			oie.ajouterMessage("elle va sur la case " + this.getNom());
			return this; //caseArrivee
			
		}
}
