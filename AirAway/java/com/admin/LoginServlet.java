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

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public LoginServlet() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username=request.getParameter("username");
String password= request.getParameter("password");
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(AdminLogin.class).buildSessionFactory();
		PrintWriter out= response.getWriter();
		
		Session session=factory.getCurrentSession();
		try {
			session.beginTransaction();
	//	AdminLogin pass=session.get(AdminLogin.class, username);
		List<AdminLogin> ls=session.createQuery("from AdminLogin a where a.username='admin'").getResultList();
		   
		for(AdminLogin al:ls) {
		String pass=	al.getPassword();
		
		
		if(username.equals("admin")&&password.equals(pass)) {
			
			response.sendRedirect("adminsuccess.jsp");
			
		}
		else {
		response.sendRedirect("/AirAway/adminloginerror.jsp");
		}
		}
		}
	finally {
		factory.close();
	}
		
	}

}
