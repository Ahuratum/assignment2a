<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		Input cannot be empty!<br>
		First Name: <%=request.getAttribute("fname") %><br>
		Last Name: <%=request.getAttribute("lname")%><br>
</body>
</html>