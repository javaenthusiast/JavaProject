<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Servings Page</title>

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


Language : <a href="?language=en">English</a> | <a href="?language=sp">Spanish</a>


<h1> <spring:message code="task5.text"/> </h1>




<form:form commandName="servings">

<form:errors path="*" cssClass="errorblock" element="div" />
<fieldset>
	<table>
		<tr>
			<td>
				<spring:message code="task.text" />
			</td>
			<td><form:input path="items" cssClass="error" /> </td>
			<td> <form:errors path="items" cssClass="error"/> </td>
			
		</tr>
		
		<tr>
			<td><spring:message code="task1.text" /></td>
			<td><form:input path="date"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task2.text" /></td>
			<td><form:input path="servings" cssClass="error"/> </td>
			<td> <form:errors path="servings" cssClass="error"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task3.text" /></td>
			<td><form:input path="userId"/> </td>
		</tr>
		
		<tr>
			<td><spring:message code="task4.text" /></td>
			<td><form:input path="userName" cssClass="error"/> </td>
			<td> <form:errors path="userName" cssClass="error"/> </td>
		</tr>
		
		<tr>
			<td colspan="2">
				<input type="submit" value="Submit entries" />
			</td>
			
		</tr>

	</table>
</fieldset>

</form:form>

</body>
</html>