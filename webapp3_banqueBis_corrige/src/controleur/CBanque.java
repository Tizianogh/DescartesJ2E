package controleur;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modele.Banque;
import modele.Client;
import modele.ClientDejaExistantException;

@WebServlet("/controleur")
public class CBanque extends HttpServlet {
	
	private Banque banque = new Banque();
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nomClient");
		String adresse = request.getParameter("adresseClient");
		try {
			Client c = banque.creerClient(nom, adresse);
			request.setAttribute("clientcree", c);
		} catch (ClientDejaExistantException e) {			
			request.setAttribute("erreurcreationclient", e);
		}
		RequestDispatcher d= request.getRequestDispatcher("./Vue/CreationClientResultat.jsp");
		d.forward(request, response);
	}
}
