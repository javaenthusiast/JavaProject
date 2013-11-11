<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Challenge Page</title>

<style>

	.error {
			color: #ff0000;
		}
		
		.errorblock {
			color: #000;
			background-color: #ffEEEE;
			border: 3px solid #ff0000;
			padding: 8px;
			margin: 16px;
		}

</style>


</head>
<body>

<h1>Get Set For The Challenge Today. Add Your Goal</h1>

<form:form commandName="challenge">
	<form:errors path="*" cssClass="errorblock" element="div" />
	<table>
		<tr>
			<td>Enter Your Goal of Servings For Today</td>
			<td> <form:input path="servings" cssClass="error"/> </td>
			<td> <form:errors path="servings" cssClass="error"/> </td>
		</tr>
		
		
		<tr>
			<td colspan="3">
				<input type="submit" value="Submit Challenge" />
			</td>
			
		</tr>

	</table>


</form:form>

</body>
</html>