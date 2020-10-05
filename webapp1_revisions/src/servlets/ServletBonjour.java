package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletBonjour
 */
@WebServlet("/bonjour")
public class ServletBonjour extends HttpServlet {

	private String getName(HttpServletRequest request) {
		return request.getParameter("prenom");
	}
	
	private String getLastname (HttpServletRequest request) {
		return request.getParameter("nom");
	}
	
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		p.println("<html>");
			p.println("<body>");
				p.println(" <h1> Bonjour, c'est ma première Servlet JEE ! "+getLastname(request)+ " "+getLastname(request)+ "</h1>");
			p.println("</body>");
		p.println("</html>");
	}

}
