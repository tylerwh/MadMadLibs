<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create MadLib Page</title>
</head>
<body>
	<h1 style="text-align: center; text-decoration: underline;">Create Your MadLib</h1>
	<br>
	<br>
	<form action="buildMadLibServlet" method="post">
		Person's First Name: <input type="text" name="characterName"><br><br>
		Part of the Body:    <input type="text" name="bodyPart"><br><br>
		Liquid:              <input type="text" name="liquid"><br><br>
		Medicinal Substance: <input type="text" name="substance"><br><br>
		<input type="submit" value="Finish" />
	</form>

</body>
</html>