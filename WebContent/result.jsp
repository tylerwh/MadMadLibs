<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display MadLib Page</title>
</head>
<body>
	<h1 style="text-align: center;">Mad MadLib, friend!</h1><br><br>
	<p>${userMadLib.getCharacterName() } is sick with the <br>
	${userMadLib.getBodyPart() } flu. Drink more ${userMadLib.getLiquid() } <br>
	and take ${userMadLib.getSubstance() } as needed.
	</p>
	<br>
	<p>Author: ${userMadLib.getFirstName() } ${userMadLib.getLastName() }
	</p>

</body>
</html>