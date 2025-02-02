package com.formation;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleur", eager = true)
@SessionScoped
public class ControleurToucheCoule {

	final int max = 20;
	Navire navire;

	public List<Case> lescases = new ArrayList<Case>();

	public List<Case> getLescases() {
		return lescases;
	}

	public void setLescases(List<Case> lescases) {
		this.lescases = lescases;
	}

	public ControleurToucheCoule() {

		for (int i = 0; i < 20; i++) {

			lescases.add(new Case(i));
		}
		// Creer le navire
		navire = new Navire(max);

	}

	public void selection(Case lacase) {

		lacase.setEtat(true);
		System.out.println(lacase.valeur);
		System.out.println(navire.getPosition() + "::" + navire.getLongueur());
		System.out.println(lacase.valeur);
		System.out.println("toucher = " + navire.getTouche());
	}

}
