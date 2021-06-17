<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8" />
  <meta http-equiv="X-UA-Compatible" content="IE=edge" />
  <meta name="viewport" content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no">
  <meta name="HandheldFriendly" content="true">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous">
  </script>
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
  <link rel="stylesheet" href="css/casas.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" />
  <!-- Google Fonts -->
  <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap" />
  <!-- Bootstrap core CSS -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css" rel="stylesheet" />
  <!-- Material Design Bootstrap -->
  <link href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="css/dashboard.css" />
  <link rel="shortcut icon" href="images/ELearningFavicon.png" type="image/x-icon">

  <!-- JQuery -->

  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

  <!-- Bootstrap tooltips -->

  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.4/umd/popper.min.js">
  </script>

  <!-- Bootstrap core JavaScript -->

  <script type="text/javascript"
    src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/js/bootstrap.min.js"></script>

  <!-- MDB core JavaScript -->

  <script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/js/mdb.min.js"></script>

  <title>E-Learning</title>

</head>
<body>
<nav class="mb-1 navbar navbar-expand-lg navbar-dark">
   <a href="home.jsp"> <img src="images/ELearningIcon.png" width="40px"> </a>
    <a class="navbar-brand" href="home.jsp">E - Learning</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent-555"
      aria-controls="navbarSupportedContent-555" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent-555">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item active">
          <a class="nav-link mr-5" href="home.jsp">
            Home
            <span class="sr-only">(current)</span>
          </a>
        </li>      
          <li class="nav-item">
          <a class="nav-link mr-5" href="#">About</a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link" id="navbarDropdownMenuLink-333" data-toggle="dropdown" aria-haspopup="true"
            aria-expanded="false">
            <i class="fas fa-user-circle fa-lg"></i>
          </a> 
            <form action = "logout" method = "post" class="dropdown-menu dropdown-menu-right dropdown-default">
			<input class="dropdown-item" type = "submit" value = "Logout">			 
			</form>          
        </li>
        </ul>
        </div>
        </nav>
  <!--/.Navbar -->
<section>
<div align = "center">

<form action = "receipt?courseName =<c:out value='${train.courseName}'/>">
	<label>Course ID: </label><br>
 	<input type="text" name="courseID" value="<c:out value='${train.courseId}' />" readonly><br>
	<label>Course Title:</label><br>
 	<input type="text" name="courseName" value="<c:out value='${train.courseName}' />" readonly><br>
	<label>Descritption:</label><br>
 	<input type="text" name="description" value="<c:out value='${train.description}' />" readonly><br>
 	<label>Trainer:</label><br>
 	<input type="text" name="trainer" value="<c:out value='${train.trainer}' />" readonly><br>
 	<label>start:</label><br>
 	<input type="text" name="start" value="<c:out value='${train.start}' />" readonly><br>
 	<label>End:</label><br>
 	<input type="text" name="end" value="<c:out value='${train.end}' />" readonly><br>
    <br>
              
    <input type="button" value="Go back!" onclick="history.back()">
    <input type="submit" value="Add Training">
    </form>


</div>
</section>

 <footer class="page-footer font-small bg-fujitsu">
    <!-- Copyright -->
    <div class="footer-copyright text-center py-3">
      © 2021 Team 2,
      <a href="#">All Right Reserved.</a>
    </div>
    <!-- Copyright -->
  </footer>
  
  
</body>
</html>