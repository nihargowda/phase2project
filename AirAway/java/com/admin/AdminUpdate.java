package com.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
@WebServlet("/Admin")
public class AdminUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public AdminUpdate() {
        super();
      
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String username= request.getParameter("username");
		String oldpassword = request.getParameter("oldpassword");
		String newpassword = request.getParameter("newpassword");
		String empty="";
				SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
						.addAnnotatedClass(AdminLogin.class).buildSessionFactory();
				PrintWriter out= response.getWriter();
				
				Session session=factory.getCurrentSession();
				try {
					session.beginTransaction();
			
			
				List<AdminLogin> ls=session.createQuery("from AdminLogin a where a.username='admin'").getResultList();
				   
				for(AdminLogin al:ls) {
				String oldpass=	al.getPassword();
				
				
				
				 if(newpassword.equals("empty") || newpassword.length()<5 ) {
				out.print("Minimum Length of Password is 5, Please Re-Enter ");
				out.print("<h4>click <a href='/AirAway/adminlogin.jsp'>here</a> to go back to admin login page</h4>");
				out.print("<h4>click <a href='/AirAway/updatepassword.jsp'>here</a> to go back to update password page</h4>");
				}
				 else if(oldpass.equals(oldpassword) && username.equals("admin") ) {
					 session.createQuery("update AdminLogin set password='"+newpassword+"'").executeUpdate();
						session.getTransaction().commit();
					 out.print("Password Updated Successfully"+"<br><br>");
					 out.print("<h4>click <a href='/AirAway/adminlogin.jsp'>here</a> to go back to admin login page</h4>");
				 }
				 else  {
						out.print("Invalid  UserName or  Old Password,Please Re-enter");
						out.print("<h4>click <a href='/AirAway/adminlogin.jsp'>here</a> to go back to admin login page</h4>");
						out.print("<h4>click <a href='/AirAway/updatepassword.jsp'>here</a> to go back to update password page</h4>");
					}
				
				}
					
		
	}
				finally {
					factory.close();
				}
					

}}
