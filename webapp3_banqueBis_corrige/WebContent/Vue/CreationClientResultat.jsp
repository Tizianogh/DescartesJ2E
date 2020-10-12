<%@ page import="modele.Client"
language="java" contentType="text/html; charset=ISO-8859-1"  pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String nom = request.getParameter("nomClient");
	Client client = (Client) request.getAttribute("clientcree");
	Exception e = (Exception) request.getAttribute("erreurcreationclient");
%>

<html>
<body>

<h1> Le client <%= nom %> </h1>
<%	if (e == null) { %>
	a été enregistré sous le numéro <span style="font-style: inherit;"> <%= client.getNumero() %> </span> 
<%}
else {  %>
	<span style="color:red;"> n'a pas pu être enregistré car existe déjà ! </span>
<%}%>

</body>
</html>