package com.formation;

import java.util.Random;

public class Navire {

	String name = "Navire1";
	int position;
	int longueur;
	int touche;
	boolean coule = false;

	public Navire(int max) {

		Random r = new Random();
		position = r.nextInt(max);
		longueur = r.nextInt(5);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getLongueur() {
		return longueur;
	}

	public void setLongueur(int longueur) {
		this.longueur = longueur;
	}

	public int getTouche() {
		return touche;
	}

	public void setTouche(int touche) {
		this.touche = touche;
	}

	public boolean isCoule() {
		return coule;
	}

	public void setCoule(boolean coule) {
		this.coule = coule;
	}

	public Navire(String name, int position, int longueur, int touche, boolean coule) {
		super();
		this.name = name;
		this.position = position;
		this.longueur = longueur;
		this.touche = touche;
		this.coule = coule;
	}

	public void evaluer(int tir) {

		if (tir >= position && tir <= position + longueur) {

			touche++;
			if (touche == longueur);
		}
	}

}
