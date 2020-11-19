package com.airline;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Payment")
public class PaymentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public PaymentServlet() {
        super();
       
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String number =request.getParameter("number");
		String cvv = request.getParameter("cvv");
		String date= request.getParameter("date");
		String empty = "";
		
		if(name.equals(empty)|| number.equals(empty)|| cvv.equals(empty)|| date.equals(empty)) {
response.sendRedirect("paymenterror.jsp");
}
		else {
			response.sendRedirect("ticketbooked.jsp");	
		}
}}