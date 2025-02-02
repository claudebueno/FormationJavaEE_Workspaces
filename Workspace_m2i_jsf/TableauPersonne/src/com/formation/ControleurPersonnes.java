package com.formation;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleur", eager = true)
@SessionScoped
public class ControleurPersonnes {

	private List<Personne> personnes = new ArrayList<Personne>();

	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public ControleurPersonnes() {
		remplir();
	}

	public void ajouter() {

		for (int i = 0; i < 10; i++) {
			personnes.add(new Personne("Leon" + i, "Durand" + i, 18 + i));

		}

	}

	public void supprimer(Personne p) {
		//personnes.remove(p);
	}

	public void remplir() {

		for (int i = 0; i < 10; i++) {

			personnes.add(new Personne("Leon" + i, "Durand" + i, 18 + i));

		}

	}

}
