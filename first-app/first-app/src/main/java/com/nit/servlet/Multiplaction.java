package com.nit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;

/**
 * Servlet implementation class Multiplaction
 */
@SuppressWarnings("serial")
@WebServlet("/table")
public class Multiplaction extends GenericServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Multiplaction() {
        super();
        // TODO Auto-generated constructor stub
    }

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw=response.getWriter();
		pw.println("<html><body bgcolor=pink text=blue>");
		pw.println("<table border=5");
		for(int i=1; i<=100; i++) {
			pw.println("<tr><td>5</td>");
			pw.println("<td>*</td>");
			pw.println("<td>"+i+"</td>");
			pw.println("<td>=</td>");
			pw.println("<td>"+5*i+"</td>");
			
		}
		pw.println("<tr></table></body></html>");
	}

	
}
