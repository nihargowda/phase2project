package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AirAwayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public AirAwayDetails() {
        super();
       
    }

Connection con;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String sourcesql= "SELECT *  FROM airlinedetails";
		PrintWriter out= response.getWriter();
		out.print("<h4><a href='/AirAway/index.jsp'>Home Page</a> </h4>");
		out.print("<h4><a href='/AirAway/adminsuccess.jsp'>Admin Page</a> </h4>");
		out.print("<h4><a href='/AirAway/adminlogin.jsp'>Logout</a> </h4>");
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			 con= DriverManager .getConnection("jdbc:mysql://localhost:3307/airaway","root","");
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		try {
			Statement	s = con.createStatement();
			ResultSet rs= s.executeQuery(sourcesql);
			
			
			while(rs.next()) {
				out.print("ID :"+"&nbsp"+rs.getInt("id")+"<br>");
				out.print("SOURCE :"+"&nbsp"+rs.getString("source")+"<br>");
				out.print("DESTINATION :"+"&nbsp"+rs.getString("destination")+"<br>");
				out.print("AIRLINE :"+"&nbsp"+rs.getString("airline")+"<br>");
				out.print("TICKET PRICE :"+"&nbsp"+rs.getInt("price")+"<br>");
				out.print("___________________________________"+"<br><br>");
				
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		out.print("<h4><a href='/AirAway/adminlogin.jsp'>Logout</a> </h4>");
			
		
		
		

		
		
		
	
	}

}
