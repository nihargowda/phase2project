package com.airline;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;









@WebServlet("/FlightSearch")
public class FlightSearchServlet extends HttpServlet {

	private static final long serialVersionUID = -2840207959097679076L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		
	
		String source=request.getParameter("source");
		 String destination=request.getParameter("destination");
          response.setContentType("text/html");
		int passengers=Integer.parseInt(request.getParameter("passengers"));
		String date= request.getParameter("date");
	
	


		
	
		if(source.equals(destination) || source.equals("----") || destination.equals("----")) {
			response.sendRedirect("sourcedestinationerror.jsp");
			}
		else if( passengers<1) {
			response.sendRedirect("numofpassengers.jsp");
			}
		else if(date.equals("")) {
			
		response.sendRedirect("dateerror.jsp");	
		}
		else {
			session.setAttribute("source",source);
			session.setAttribute("destination",destination);
			session.setAttribute("passengers",passengers);
			session.setAttribute("date",date);
			
			response.sendRedirect("flightdetails.jsp");
			
		
	}}}