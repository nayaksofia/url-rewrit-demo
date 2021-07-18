package com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Dashboard extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        
        String userId = request.getParameter("userid");
        if (userId == null ) {
            out.println("No UserId was found in the URL.<br>");
        } else {
            out.println("UserId obtained from URL Rewriting:" + userId + "<br>");
        }
        out.println("</body></html>");


		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
