package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.Banque;
import metier.Client;

/**
 * Servlet implementation class CBanque
 */
@WebServlet("/CBanque")
public class CBanque extends HttpServlet{
	private static final long serialVersionUID = 1L;
       Banque banque = new Banque();
   
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		String getName = request.getParameter("name");
		String getAdress = request.getParameter("adress");
		
		ArrayList<Client> test = banque.creerClient(getName, getAdress);
		request.setAttribute("ClientCreate", banque.getClients());
		
		RequestDispatcher d = request.getRequestDispatcher("./ResultatCreateClient.jsp");		
		d.forward(request, response);
	}
}
