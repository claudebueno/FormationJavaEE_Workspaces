package com.formation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "nombresecret", eager = true)
@SessionScoped
public class NombreSecret {

	int secret = (int) Math.random() * (0 - 100);
	int nbEssai = 10;
	int compteur = 10;
	int proposition;
	String message;
	
	

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getSecret() {
		return secret;
	}

	public void setSecret(int secret) {
		this.secret = secret;
	}

	public int getNbEssai() {
		return nbEssai;
	}

	public void setNbEssai(int nbEssai) {
		this.nbEssai = nbEssai;
	}

	public int getProposition() {
		return proposition;
	}

	public void setProposition(int proposition) {
		this.proposition = proposition;
	}

	public void validerProposition() {

		if (nbEssai == 0) {
			message = "Dommage ";
			return;
		}

		if (proposition > secret) {

			message = "Proposition plus grande que le nombre secret";
		} else if (proposition < secret) {
			message = "Proposition plus petite que le nombre secret";
		} else {
			compteur++;
			message = "Gagn� !";
		}
		
		nbEssai --;

	}

}
