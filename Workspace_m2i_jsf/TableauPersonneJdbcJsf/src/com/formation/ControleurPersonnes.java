package com.formation;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "controleur", eager = true)
@SessionScoped
public class ControleurPersonnes {

	private List<Personne> personnes = new ArrayList<Personne>();
	public PersonnesDAO personne;


	public List<Personne> getPersonnes() {
		return personnes;
	}

	public void setPersonnes(List<Personne> personnes) {
		this.personnes = personnes;
	}

	public ControleurPersonnes() throws SQLException {
		personne = new PersonnesDAO();
		personne.ouvrirConnexion();
		personnes = personne.lirePersonnes();
		remplir();
	}

	public void inserer() throws SQLException {

	}
	
	public void supprimer(Personne p) throws SQLException {

	}

	public void remplir() {

	}

}