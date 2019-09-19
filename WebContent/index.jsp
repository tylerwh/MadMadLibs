<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to MadLibs</title>
</head>
<body>
	<h1 style="text-align:center">Welcome to MadLibs!</h1>
	<br>
	<br>
	<form action="getMadLibServlet" method="post">
		Let's get to know who our author is. <br /><br />
		First Name: <input type="text" name="firstName"><br />
		Last Name:  <input type="text" name="lastName"><br /><br />
		<input type="submit" value="Create MadLib" />
		
	</form>
</body>
</html>