package com.jee.test.hello;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String adresseDistante = request.getRemoteAddr();
		String test1 = request.getParameter("test1");
		Map<String, String[]> test = request.getParameterMap();
		
		out.print("<html>");
		out.print("<title>Connard !</title>");
		out.print("<body>");
		out.print("<h1>");
		out.print("Bonjour");
		out.print("</h1>");
		out.print("Ton adresse est : " + adresseDistante);
		out.print("<br/>Ton parametre test1 est : \"" + test1);
		out.print("<form>");
		out.print("</form>");
		out.print("\"</body>");
		out.print("</html>");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter  out  =   response.getWriter();    
		
		for (Entry<String, String[]> arg : request.getParameterMap().entrySet()) {
			for (String value : arg.getValue()) {
				out.println(arg.getKey() + " : " + value); 
			}
		}
		// TODO Auto-generated method stub
	}

}
