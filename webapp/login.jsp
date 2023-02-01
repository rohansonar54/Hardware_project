<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>

   <form action="loginhandler" method="post">
   
     
       <input type="text" name="user" placeholder="Enter username" required><br><br>
       <input type="text" name="pwd" placeholder="Enter Password"><br><br>
       
       <input type="submit" value="Login">
   
   		<a href="signup.jsp" > <input type="button" value="signup"> </a>
   
   		<a href="forget.jsp" > <p>forget password</p> </a>
   </form>

<form action="pdfge.java"> 
	 <input type="submit" value="pdf">
   
</form>


<script language=javascript>
function printPage() {
if (window.print) {
agree = confirm('You must now print out this page \nso 8 copies can be mailed to the commitee. \n\nPress OK to print now! \n\nIf you cancel, you can print the page by pressing CTRL P.');
if (agree) window.print();
}
}
</script>
	

 


</body>
</html>