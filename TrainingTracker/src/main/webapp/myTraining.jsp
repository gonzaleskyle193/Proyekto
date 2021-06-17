<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<section>
<div align = "center"></div>
			<table border ="1">
				<thead>
					<tr>
						<th>Receipt ID</th>
						<th>Course Name</th>											
					</tr>
				</thead>
				<tbody>
				
					<c:forEach var="train" items="${mylist}">

						<tr>
							<td><c:out value="${train.receipt_id}" /></td>
							<td><c:out value="${train.courseName}" /></td>						
											
							
							
							
						</tr>
					</c:forEach>
		
				</tbody>

			</table>
</section>			




</body>
</html>