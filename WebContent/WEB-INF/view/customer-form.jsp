<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer registration form</title>
<style type="text/css">
.error{
	color:red;
	font-style:italic;
}
</style>
</head>
<body>

<form:form action="processForm" modelAttribute="customer">

first name
<form:input path="firstName"/>
<Br><br>
last name
<form:input path="lastName"/>
<form:errors path="lastName" cssClass="error"/>
<br><br>
Free passes
<form:input path="freePasses"/>
<form:errors path="freePasses" cssClass="error"/>

<br><br>
Postal code
<form:input path="postalCode"/>
<form:errors path="postalCode" cssClass="error"/>

<br><br>
Course code
<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>

<br><br>

<input type="submit" value="submit"/>

</form:form>
</body>
</html>