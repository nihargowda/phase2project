<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2><center>Ticket Confirmation Page</center></h2>
TICKET CONFIRMED<br><br>
<jsp:include page="useroutput.jsp" ></jsp:include><br><br>


<% 
String source=session.getAttribute("source").toString();
			String destination=session.getAttribute("destination").toString();
			int passengers=(int)session.getAttribute("passengers");
			String date=session.getAttribute("date").toString();
			
			
			out.print("Source :&nbsp"+source+"&nbsp&nbsp&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
			out.print("Destination :&nbsp"+destination+"<br><br>");
			
			out.print("Number of passengers :"+passengers+"<br><br>");
			%>
<br>
THANK YOU 
<br><h4>select <a href="/AirAway/index.jsp">Home</a> to go back to home page</h4>
</body>
</html>