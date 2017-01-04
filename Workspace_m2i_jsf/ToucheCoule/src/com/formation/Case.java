package com.formation;

public class Case {

	int valeur;
	boolean etat;

	public Case(boolean etat) {

		this.etat = etat;
	}

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}

	public boolean isEtat() {
		return etat;
	}

	public void setEtat(boolean etat) {
		this.etat = etat;
	}

	public Case(int val) {
		this.etat = false;
		this.valeur = val;
	}

	public String getColor() {
		if (etat == true) return"yellow";
		else return "grey";
		
	}
	
	
}
