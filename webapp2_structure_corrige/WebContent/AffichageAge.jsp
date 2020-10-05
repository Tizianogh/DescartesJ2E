<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String nom = request.getParameter("nom");
	Integer age = (Integer) request.getAttribute("agecalcule");
	Exception erreur = (Exception) request.getAttribute("erreurCalcul");
%>

<html>
<body>
<%
	if (erreur == null) { %>
		<h1> <%= nom  %>, vous avez <%= age %> ans !</h1>		
	<%} else { %>
		<h2> Erreur de format de date de naissance... </h2>
	<%}
%>
	
</body>
</html>