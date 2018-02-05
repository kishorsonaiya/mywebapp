package com.infosys.fsstar.jenkins;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginservlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		PrintWriter out = response.getWriter();
		
		if ( ( "jiteshkumar.patel@infosys.com".equalsIgnoreCase(email) ||  "jitesh".equalsIgnoreCase(email) )&& "1234".equalsIgnoreCase(password) ){
			out.append("</br><h1><span id='loginServlet_success' name='loginServlet_success'>Welcome, Mr. Jitesh Patel.</span></h1> Today is " + new Date() + "</br>");
		}
		else {
			out.append("</br><h1><span id='loginServlet_failure' name='loginServlet_failure'>Email/Password is not correct.</span></h1> Please try again. </br>");
		}
		
		out.append("</br> </br>servlet page version v5.0");	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
