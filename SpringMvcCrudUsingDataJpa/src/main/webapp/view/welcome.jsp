<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration form</title>
</head>
<body>
	<h1>USER REGISTRATION FORM</h1>

	<form action="saveUser" Method="POST">
	

	<table>
	
		<tr>
			<td>FIRSTNAME</td>
			<td><input type="text" name="fname"></td>
		</tr>
		
		<tr>
			<td>LASTNAME</td>
			<td><input type="text" name="lname"></td>
		</tr>
		
		<tr>
			<td>EMAIL</td>
			<td><input type="text" name="email"></td>
		</tr>
		
		<tr>
			<td>USERNAME</td>
			<td><input type="text" name="username"></td>
		</tr>
		
		<tr>
			<td>PASSWORD</td>
			<td><input type="text" name="password"></td>
		</tr>
			<tr>
			<td>ADDRESS</td>
			<td><input type="text" name="useraddress"></td>
		</tr>
			<tr>
			<td>AGE</td>
			<td><input type="text" name="Userage"></td>
		</tr>
		
			<tr>
			<td><input type="submit" value="REGISTER"></td>
		</tr>
		
	</table>
	</form>
	
</body>
</html>