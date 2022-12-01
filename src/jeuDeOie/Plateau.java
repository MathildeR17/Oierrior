package jeuDeOie;

import jeuDeOie.Case;

public class Plateau {
	//Attributs
		private int nb_cases = 64;
		private Case[] cases = new Case[nb_cases];
		
		//Constructeur
		public Plateau() {
			for(int i=0; i<nb_cases; i++) {
				cases[i] = new Case(i);
			}
		}
		
		//Méthodes
		/**
		 * 
		 * @param numCase
		 * @return cases[]
		 */
		public Case donnerCase(int numCase) {
			return cases[numCase];
		}
		
		/**
		 * 
		 * @return cases[0]
		 */
		public Case caseDebutpartie() {
			return cases[0];
		}
}
