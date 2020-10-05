<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    
    %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    
    <%@ page import="java.util.*" %>
    <%@ page import="metier.Client" %>
  <%  
	ArrayList<Client> list = (ArrayList<Client>) request.getAttribute("ClientCreate");
  %>
    
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	for(Client unClient: list){
		out.println(unClient.getId());
		out.println(unClient.getNom());
		out.println(unClient.getAdresse());
		
	}
%>
</body>
</html>