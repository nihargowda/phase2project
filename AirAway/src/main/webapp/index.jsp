<%@page import="java.time.LocalDate"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<html>

<h2><center>WELCOME TO NIHAR'S AIRLINE TICKET BOOKING SYSTEM</center></h2>

<form action="/AirAway/FlightSearch"  method="post"  >


<%

Class.forName("com.mysql.jdbc.Driver");
Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airaway","root","");
String sourcesql= "SELECT DISTINCT source FROM airlinedetails";

Statement s= con.createStatement();
ResultSet rs= s.executeQuery(sourcesql);


%>
SOURCE: <select name="source">
<option>----</option>
<% while(rs.next()){
	
	%>
<option> <%=rs.getString("source") %></option>
<%} %>

</select>
<br>

<%

 con= DriverManager.getConnection("jdbc:mysql://localhost:3307/airaway","root","");
String sqldestination= "SELECT DISTINCT destination FROM airlinedetails";

 s= con.createStatement();
 rs= s.executeQuery(sqldestination);
%>

<br>
DESTINATION:<select name="destination">
<option>----</option>

<% while(rs.next()){
	
	%>
<option> <%=rs.getString("destination") %></option>
<%} %>
</select>

<br>
<br>Number of passengers:
<select name="passengers">
<option>0</option>
<%
for(int i=1;i<8;i++){
%>
<option><% out.print(i); %> 
</option>
<%} %>
</select>*you can only book upto 7 tickets per transaction
<br>

<br>
Date of journey 
<% LocalDate ld = LocalDate.now();%>
 <input type="date" name="date" min=<%= ld.plusDays(1)  %>><br>


<input type="submit" value="Let's Fly">


</form>



</body>
</html>
