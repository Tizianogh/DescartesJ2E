package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Age;

import javax.servlet.http.HttpServlet;

/**
 * Servlet implementation class calculAge
 */
@WebServlet("/CalculAge")
public class CalculAge extends HttpServlet {
	private static final long serialVersionUID = 1L;
         
    protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
    	String getAge = request.getParameter("dateDeNaissance");
    	String annee = getAge.substring(0,4);
    	Age age = new Age(annee);
   
    	request.setAttribute("ageCalcule", age.calculAge());
    	RequestDispatcher d = request.getRequestDispatcher("/AfficherAge.jsp");
    	d.forward(request, response);

	}
    

    
    // Pour rendre un code maintenable, il faut qu'une classe a un seul responsabilité, pas plusieurs. Dans ce cas, cette classe affiche, calcul, c'est trop.
    
    // Role, module et lien, c'est ce qui définit une architecture
}
