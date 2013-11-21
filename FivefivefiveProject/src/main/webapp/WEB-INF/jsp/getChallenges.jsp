
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Challenges Report</title>
</head>
<body>

	<table>
	
		<tr>
			<th>Challenge ID</th><th>Servings</th>
		</tr>
		
		<c:forEach items="${challenges}" var="challenge">
			<tr>
			<td>${challenge.id}</td><td>${challenge.servings}</td>
			
			<td>
				<table>
					<tr>
						<th>Servings ID</th><th>Servings Items</th><th>Servings Date</th><th>No of Servings</th><th>User Name</th><th>User ID</th>
					</tr>
					
					<c:forEach items="${challenge.listOfServings}" var="servings">
						<tr>
							<td>${servings.id}</td><td>${servings.items}</td><td>${servings.date}</td><td>${servings.servings}</td><td>${servings.userName}</td><td>${servings.userId}</td>
						</tr>
					
					</c:forEach>
				
				</table>
			</td>
		</tr>
		</c:forEach>
	
	</table>


</body>
</html>