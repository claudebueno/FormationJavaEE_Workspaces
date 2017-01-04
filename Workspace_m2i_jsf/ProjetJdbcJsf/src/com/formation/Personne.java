package com.formation;

public class Personne {

	int idpersonne;
	String nom;
	String prenom;
	int age;

	public int getIdpersonne() {
		return idpersonne;
	}

	public void setIdpersonne(int idpersonne) {
		this.idpersonne = idpersonne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Personne(int idpersonne, String nom, String prenom, int age) {
		super();
		this.idpersonne = idpersonne;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}

}
