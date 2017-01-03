<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.formation.bean.Compteur" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Compteur</title>
</head>
<body>

<jsp:useBean id="compteur" class="com.formation.bean.Compteur" scope="session">
<jsp:setProperty name="compteur" property="valeur" value="0" />
</jsp:useBean>


	<%
			compteur = (Compteur)session.getValue("compteur");
			int i = compteur.getValeur();
			i++;
			compteur.setValeur(i);
			session.putValue("compteur", compteur);
	%>

	<p>A chaque clic sur OK on incrémente de 1</p>

	<form method="post" action="index.jsp">
		<input type="text" name="value" value=<%= compteur.getValeur() %> size="5" /> 
		
		<input type="submit" name="bouton" value="OK" />
	</form>



</body>
</html>