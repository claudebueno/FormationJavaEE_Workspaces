package com.formation.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "compteur", eager = true)
public class Compteur {
	private int valeur = 0;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
}