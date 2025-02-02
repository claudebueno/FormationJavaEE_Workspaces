package com.formation.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "pingpong", eager = true)
@SessionScoped
public class PingPong {
	
	int valeurGauche = 5;
	int valeurDroite = 10;
	
	public int getValeurGauche() {
		return valeurGauche;
	}
	public void setValeurGauche(int valeurGauche) {
		this.valeurGauche = valeurGauche;
	}
	public int getValeurDroite() {
		return valeurDroite;
	}
	public void setValeurDroite(int valeurDroite) {
		this.valeurDroite = valeurDroite;
	}
	
	public void versDroite(){
		valeurDroite = valeurGauche;
	}
	
	public void versGauche(){
		valeurGauche = valeurDroite;
	}
}
