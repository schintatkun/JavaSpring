package com.codingdojo.greatnumbergame;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class greatnumber
 */
@WebServlet("/greatnumber")
public class greatnumber extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//run jsp file when user access via url
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/main.jsp");
		view.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		Integer num = (Integer) session.getAttribute("num");
		
		// set variable guessNumber = user input number
		Integer guessNumber = Integer.parseInt(request.getParameter("guessNum"));
		// generate random number
		Random rand = new Random();
		
		if(session.getAttribute("num")==null) {
			
			session.setAttribute("num", rand.nextInt(100));
		}
		System.out.println("guess : "+guessNumber);
		System.out.println("num in session : "+session.getAttribute("num"));
		
		doGet(request, response);
		
	}

}