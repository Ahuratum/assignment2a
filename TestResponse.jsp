<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>TestResponse Page</title>
</head>
<body>

	<pre>				Hello, User, <br></pre>
	<pre>	Your first name is <%=request.getAttribute("fname") %></pre><br>
	<pre>	Your last name is <%=request.getAttribute("lname")%></pre>

</body>
</html>