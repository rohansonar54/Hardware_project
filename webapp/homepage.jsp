<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HomePage</title>
</head>
<body>
<h1>welcome to homepage</h1>

<br><br>
<form action="adminprofile" method="post" name="profile">
<input type="submit" value="ADMIN PROFILE" >
</form>

<br><br>
<form action="inventoryhandler" method="post" name="inventory">
<input type="submit" value="CURRENT INVENTORY" >
</form>

<br><br>
<a href="update.jsp" > <input type="button" value="UPDATE INVENTORY"></a>
  <br><br> 
  
  <form action="updatedata" method="post" name="inventory">
<input type="submit" value="update" name="hammer5" >
</form>
  Hammer <input type="number" >

</body>
</html>