package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import metier.CalculAge;

@WebServlet("/MonAge")
public class CalculAgeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		p.println("<html>");
		p.println("<body>");
		String ddnPersonneStr = request.getParameter("ddn");
		int age;
		try {
			age = new CalculAge().calculerAge(ddnPersonneStr);
			request.setAttribute("agecalcule", age);			
		} catch (Exception e) {
			request.setAttribute("erreurCalcul", e);
		}
		RequestDispatcher d = request.getRequestDispatcher("./AffichageAge.jsp");
		d.forward(request, response);
	}

}
