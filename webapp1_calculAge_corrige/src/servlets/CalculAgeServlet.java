package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MonAge")
public class CalculAgeServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomPersonne = request.getParameter("nom");
		String ddnPersonneStr = request.getParameter("ddn");
		SimpleDateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
		int age = -1;
		try {
			Date ddnPersonne = df.parse(ddnPersonneStr);
			age = new Date().getYear() - ddnPersonne.getYear();
		} catch (ParseException e) {}
		PrintWriter p = response.getWriter();
		response.setContentType("text/html");
		p.println("<html>");
		p.println("<body>");
			p.println("Bonjour " + nomPersonne + ", vous avez <span style='color:red;'> <b> " + age + " ans </b> ! </span>" );
			p.println("</body>");
		p.println("</html>");
	}

}
