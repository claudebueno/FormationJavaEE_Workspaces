package com.formation.metier;

import java.sql.Connection;
import java.sql.SQLException;

import com.formation.dao.ConnecteurDB;

public class Lanceur {

	public static void main(String[] args) throws SQLException {

		int k = 3;
		Connection con = ConnecteurDB.getConnexion();
		try {
			ConnecteurDB.selectAll(con);
			for (k = 3; k < 12; k++) {
			}
			ConnecteurDB.selectAll(con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// ConnecteurDB.inserer(2, "Durand", "Maxime", "1887/10/05");
		
		// ConnecteurDB.supprimer(1, "Hebert", "Marielle", "2000/12/12");

	}

}
