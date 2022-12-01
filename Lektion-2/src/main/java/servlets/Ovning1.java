package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ovning1")
public class Ovning1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String imgAmount = request.getParameter("img");
		if (imgAmount != null) {
			if (imgAmount.equals("1")) {
				out.print("<img style=\"width:200px\" src=\" ./images/1.png \" />");
			} else if (imgAmount.equals("2")) {
				out.print("<img style=\"width:200px\" src=\" ./images/1.png \" />");
				out.print("<img style=\"width:200px\" src=\" ./images/2.png \" />");
			} else {
				out.print("<h1>404</h1>");
			}
		} else {
			out.print("<h1>Welcome</h1>");
		}
	}

}
