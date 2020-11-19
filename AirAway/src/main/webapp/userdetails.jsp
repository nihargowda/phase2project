<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h4><center>Passengers Registration Form</center></h4>
<form action="/AirAway/UserServlet" method="post">

Enter First Name &nbsp:<input type="text" name="fname"><br><br>
Enter Second Name &nbsp:<input type="text" name="sname"><br><br>
Enter E-mail &nbsp:<input type="text" name="mail"><br><br>
Enter Phone Number &nbsp:<input type="text" name="phone"><br><br>
Enter Address &nbsp:<input type="text" name="address"><br><br>
<input type="submit" value="proceed to payment"><br>
</form>
</body>
</html>