<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JavaEEApplication</title>
</head>
<body>
	<form action="/login.do" method="post">
	<p><font color="red">${errorMessage}</font></p>
		Name: <input type="text" name="name" /> Password: <input type="password" name="password" /> <input type="submit" value="Login"/>
	</form>
</body>
</html>