<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String fname=session.getAttribute("fname").toString();
String sname=session.getAttribute("sname").toString();
String phone=session.getAttribute("phone").toString();



out.print("Name :"+fname+"&nbsp"+sname+"<br>");
out.println("Phone :"+phone);


%>
<br>

</body>
</html>