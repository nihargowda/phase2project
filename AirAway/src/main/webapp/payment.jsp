<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h3><center>Payment Gateway</center></h3>
<jsp:include page="useroutput.jsp" ></jsp:include><br><br>
<form action="/AirAway/Payment" method=post>
<% 
String source=session.getAttribute("source").toString();
String destination=session.getAttribute("destination").toString();

out.print("Source :&nbsp"+source+"&nbsp&nbsp&nbsp&nbsp&nbsp|&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp");
out.print("Destination :&nbsp"+destination+"<br><br>");
%> 
<h5>ENTER CARD DETAILS </h5>			
Select type of card: <input type="radio" name="cardtype" value="credit" >credit &nbsp &nbsp

<input type="radio" name="cardtype" value="debit" >debit
            
<br><br>
Name On Card : <input type="text" name="name"><br><br>
Card Number :<input type="number" name="number"><br><br>
Cvv :<input type="password" name="cvv"><br><br>

Expiry Date <input type="date" name="date"><br><br>

<input type="submit" value="Confirm">





</form>
</body>
</html>