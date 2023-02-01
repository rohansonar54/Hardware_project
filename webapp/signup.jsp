<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>sign up</title>
</head>
<body>

<form action="signuphandler" method="post">
	<p>enter details to be maintain in database</p> <br><br><br>
	<DIV> 
	<P>SHOP DETAILS</P><BR>
	USER ID<input type="text" name="uname"><br><br>
	PASS<input type="text" name="upass"><br><br>
	CONFIRM PASS<input type="text" name="cpass"><br><br>
	SHOP NAME<input type="text" name="sname"><br><br>
	SHOP PHONE NO<input type="text" name="spno"><br><br>
	SHOP MAIL ID<input type="text" name="smail"><br><br>
	
	</DIV>
	
	<DIV style="margin-left: 542px;
    margin-top: -360px;"> 
	<P>STOCK DETAILS</P><BR>
	Hammer <input type="number" name="hammer"><br><br>
	Wood Cutter<input type="text" name="wood"><br><br>
	Axe <input type="text" name="axe"><br><br>
	Grass Cutter<input type="text" name="grasscutter"><br><br>
	Pipe<input type="text" name="pipe"><br><br>
	Door Locks<input type="text" name="doorlock"><br><br>
	Sefty Helmet<input type="text" name="sefty"><br><br>
	cooler Stand<input type="text" name="cooler"><br><br>
	</DIV>
	
	
	<input type="submit" value="insert data">
	
	</form>
</body>
</html>