package com.jee.test.compteur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class compteur
 */
@WebServlet("/compteur")
public class Compteur extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int cpt = 2147483645;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Compteur() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		cpt++;
		PrintWriter  out  =   response.getWriter();
		out.print("<html>");
		out.print("<title>Connard !</title>");
		out.print("<body>");
		out.print(cpt);
		out.print("</body>");
		out.print("</html>");
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
