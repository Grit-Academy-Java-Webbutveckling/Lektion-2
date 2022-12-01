package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Ovning2")
public class Ovning2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("	<form action=\"ThirdServlet\" method=\"get\">\r\n"
				+ "			<input name=\"height\" type=\"text\" placeholder=\"height\">\r\n"
				+ "			    <input name=\"width\" type=\"text\" placeholder=\"width\">\r\n"
				+ "			<input type=\"submit\" value=\"Change Image size\">\r\n" + "		</form>");
		String width = request.getParameter("width");
		String height = request.getParameter("height");
		if (width != null && height != null && (!width.equals("") || !height.equals(""))) {
			out.print("<img style=width:" + width + "px;height:" + height + "px src=\" ./images/1.png \" />");
		} else {
			out.print("<img style=\"width:200px\" src=\" ./images/1.png \" />");
		}

	}

}
