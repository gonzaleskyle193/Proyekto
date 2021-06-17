<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title> Login </title>

<link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"rel="stylesheet">
<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" rel="stylesheet">
<link href="https://cdnjs.cloudflare.com/ajax/libs/mdb-ui-kit/3.5.0/mdb.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://use.fontawesome.com/releases/v5.15.3/js/all.js" data-auto-replace-svg="nest"></script>
<script src="http://code.jquery.com/jquery-3.2.1.slim.min.js"> </script>
<link rel="preconnect" href="https://fonts.gstatic.com">
<link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,300;0,400;1,300;1,400&display=swap" rel="stylesheet">
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/2.9.2/umd/popper.min.js" 
integrity="sha512-2rNj2KJ+D8s1ceNasTIex6z4HWyOnEYLVC3FigGOmyQCZc2eBXKgOxQmo3oKLHyfcj53uz4QMsRCWNbLd32Q1g==" 
crossorigin="anonymous" referrerpolicy="no-referrer"></script>
<link rel="stylesheet" href="css/gabutin.css">

</head>
<body>

 <div class="container">
        <div class="forms-container">
            <div class="signin-signup">
		
		<!--Registration form-->
	<form action = "login" method = "post" class="sign-in-form">
		<h2 class="title">Sign in</h2>
		
			  <div class="input-field">
			  <i class ="fas fa-user-tie"></i>
			  <input placeholder="Username" name = "username" required>
			 </div>
			  
			  <div class="input-field">
						  <i class ="fas fa-lock"></i>
						  <input placeholder="Password" name = "password" required id="myInput">
						
						
						 <span class="eye" onclick="showPassword()">
                            <i id="hide1" class ="fa fa-eye"> </i>
                            <i id="hide2" class ="fa fa-eye-slash"> </i>
                           </span>
               </div>
		<input type = "submit" value = "Login" class="btn solid">
	</form>
		
	
                

<div align = "center">
<h1>Sign Up</h1>
	 <!--Registration form-->
		 
		 <form action = "register" method = "post">
			<table>
			<tr><td>First Name: </td><td><input type = "text" name = "firstname"> </td></tr>
			<tr><td>Last Name : </td><td><input type = "text" name = "lastname"> </td></tr>
			<tr><td>User Name : </td><td><input type = "text" name = "r_username"> </td></tr>
			<tr><td>Password : </td><td><input type = "password" name = "r_password"> </td></tr>
			<tr><td>Email : </td><td><input type = "text" name = "email"> </td></tr>
			<tr><td>Contact No.: </td><td><input type = "text" name = "contact"> </td></tr>
		    <tr><td> </td><td><input type = "hidden" value = "1" name = "manager"> </td></tr>
			<tr><td></td><td><input type = "submit" value = "Sign Up"> </td></tr>
		</table>
		
		</form>
</div>
	
</body>
</html>