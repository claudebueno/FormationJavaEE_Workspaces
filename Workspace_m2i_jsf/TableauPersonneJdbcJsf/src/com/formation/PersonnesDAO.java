package com.formation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonnesDAO {

	Connection conn = null;
	Statement stmt = null;
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/formationdb";
	String sql;
	ResultSet rs;

	public PersonnesDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Connecting to database...");
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	public void fermerConnexion() {
		try {
			rs.close();
			stmt.close();
			conn.close();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	public void ouvrirConnexion() {
		try {
			conn = DriverManager.getConnection(DB_URL, "root", "");
			stmt = conn.createStatement();
		} catch (Exception se) {
			se.printStackTrace();
		}
	}

	public List lirePersonnes() throws SQLException {

		ArrayList<Personne> personnes = new ArrayList<Personne>();
		sql = "select * from personnes";
		rs = stmt.executeQuery(sql);

		// Extract data from result set
		while (rs.next()) {
			// Retrieve by column name
			int idpersonne = rs.getInt("idpersonne");
			String nom = rs.getString("nom");
			String prenom = rs.getString("prenom");
			int age = rs.getInt("age");
			personnes.add(new Personne(idpersonne, nom, prenom, age));
		}
		return personnes;
	}

	public List insererPersonnes() throws SQLException {

		return null;
	}

	public List supprimerPersonnes() throws SQLException {

		ArrayList<Personne> personnes = new ArrayList<Personne>();
		sql = "select * from personnes";
		rs = stmt.executeQuery(sql);

		return null;

	}

}