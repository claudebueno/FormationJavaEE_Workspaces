package com.formation.dao;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class ConnecteurDB {

	public static String nomConnexion = "postgres"; // du contexte 5433
	public static String motDePasse = "root"; // end du contexte
	public static String nom_schema = "tp1";

	public static Connection getConnexion() {
		try {
			// chargement de la classe par son nom

			String protocolePostgres = "jdbc:postgresql:";
			// Adresse IP de l'h�te de la base et port
			String ip = "localhost"; // d�pend du contexte
			String port = "5432"; // port MySQL par d�faut
			String conString = protocolePostgres + "//" + ip + ":" + port + "/" + nom_schema;

			// Connexion
			Connection con = DriverManager.getConnection(conString, nomConnexion, motDePasse);

			return con;

		} catch (Exception e) {
			System.out.println("probleme de connexion a la bdd");
			e.printStackTrace();
		}

		return null;
	}

	public static void selectAll(Connection con) throws SQLException {
		String sql = "select * from " + "tp1" + "." + "Utilisateurs";
		Statement smt = (Statement) con.createStatement();
		ResultSet rs = (ResultSet) smt.executeQuery(sql);
		while (rs.next()) {
			System.out.println(rs.getString("nom"));
		}
	}

	public static void inserer(int identifiant, String nom, String prenom, String date_naissance) throws SQLException {
		Connection con = getConnexion();
		String insertOrder = creerUneRequeteInseertionPostgres(identifiant, nom, prenom, date_naissance);
		Statement smt = (Statement) con.createStatement();
		System.out.println("La requete que j'execute : " + insertOrder);
		smt.execute(insertOrder);
	}

	private static String creerUneRequeteInseertionPostgres(int id, String nom, String prenom, String date_naissance) {
		String strSQL;
		
		strSQL="INSERT INTO tp1.utilisateurs (id,nom,prenom,date_naissance) ";
		strSQL+="VALUES ("+id+",'"+nom+"','"+prenom+"','"+date_naissance+"');";
		return strSQL;
	}
	
	public static void supprimer(int identifiant, String nom, String prenom, String date_naissance) throws SQLException {
		Connection con = getConnexion();
		String insertOrder = creerUneRequeteSuppressionPostgres(identifiant, nom, prenom, date_naissance);
		Statement smt = (Statement) con.createStatement();
		System.out.println("La requete que j'execute : " + insertOrder);
		smt.execute(insertOrder);
	}

	private static String creerUneRequeteSuppressionPostgres(int id, String nom, String prenom, String date_naissance) {
		String scriptSuppressionUtilisateur;
		
		scriptSuppressionUtilisateur="DELETE FROM tp1.utilisateurs ";
		scriptSuppressionUtilisateur+="WHERE id = "+ id +" AND nom = "+ nom +" AND prenom = "+ prenom +" AND date_naissance = " + date_naissance +";";
		return scriptSuppressionUtilisateur;
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
/*	public static void supprimer(int identifiant, String nom, String prenom, String date_naissance)
			throws SQLException {
		Connection con = getConnexion();
		String suppressOrder = creerUneRequeteSuppression(identifiant, nom, prenom, date_naissance);
		Statement smt = (Statement) con.createStatement();
		System.out.println("La requete que j'execute : " + suppressOrder);
		smt.execute(suppressOrder);
	}

	private static String creerUneRequeteSuppression(int id, String nom, String prenom, String date_naissance) {
		String scriptSuppressionUtilisaeur;

		scriptSuppressionUtilisaeur = "DELETE FROM tp1.utilisateurs (id,nom,prenom,date_naissance) ";
		scriptSuppressionUtilisaeur += "VALUES (" + id + ",'" + nom + "','" + prenom + "','" + date_naissance + "');";

		return scriptSuppressionUtilisaeur;
	}*/

}
