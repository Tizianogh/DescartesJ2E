<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ page import="java.util.*" %>
<% Date today = new java.util.Date();%>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Accueil JSP</title>
	</head>
	<body>
		<div style="text-align:center;">
			<h1 style="color:red;"> Bonjour Tiziano !</h1>
			<h2 style="color:red;"> Aujourd'hui, nous sommes le <%=today.toString()%>.</h1>
		</div>
	</body>
</html>