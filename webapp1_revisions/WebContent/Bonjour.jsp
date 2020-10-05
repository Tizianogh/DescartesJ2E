<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.*" %>
    <% Date today = new Date();
Calendar calendar = new GregorianCalendar();
calendar.setTime(today);
int year = calendar.get(Calendar.YEAR);
%>

<% 
	String name = request.getParameter("name");
	String age = request.getParameter("age");
    int qch = Integer.parseInt(request.getParameter("qch"));

%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		<form action="Bonjour.jsp" method=post>
			Votre nom : <input name="name" placeholder="Nom...">
			Votre age : <input name="age" placeholder="Age..">
			<input type="submit"
			 value="Voir le résultat!">
			 	<%=year %>
		</form>	
	
	</body>
</html>