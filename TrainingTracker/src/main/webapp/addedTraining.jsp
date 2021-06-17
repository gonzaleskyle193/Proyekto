<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		Successfully Added Training
		</h1>


			<a href="<%=request.getContextPath()%>/TrainingServlet">Sav</a>

			<section>
				<%

		String name=(String)session.getAttribute("username"); 
		out.print("Hello User: You have entered the name: "+name); 
		%>
			</section>
</body>
</html>