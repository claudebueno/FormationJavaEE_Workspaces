package com.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "compteur", eager = true)
@SessionScoped
public class Compteur {
	private int valeur = 0;

	public int getValeur() {
		return valeur;
	}

	public void setValeur(int valeur) {
		this.valeur = valeur;
	}
	
	public void incrementer(){
		System.out.println("Incrementer");
		this.valeur++;
	}
	
	public void decrementer(){
		System.out.println("Decrementer");
		this.valeur--;
	}
}