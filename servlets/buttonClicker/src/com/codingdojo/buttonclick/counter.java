package com.codingdojo.buttonclick;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class counter
 */
@WebServlet("/counter")
public class counter extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			// initialize session
				HttpSession session = request.getSession();
				String countNum = (String) session.getAttribute("countNum");
				Integer clickNum = 0;
				
				if (countNum == null) {
					session.setAttribute("countNum", "0");
				}
				else {
					clickNum = Integer.parseInt(countNum);
					clickNum+=1;
					countNum = clickNum.toString();
					session.setAttribute("countNum", countNum);
				}
				RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
				view.forward(request, response);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
