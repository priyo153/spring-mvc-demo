<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form:form action="processForm" modelAttribute="mystudent">
First Name: <form:input path="firstName"/>
<br><br>
Last Name: <form:input path="lastName"/>
<br><br>
<form:select path="country">
	<form:option value="brazil" label="BR"></form:option>
	<form:option value="india" label="IN"></form:option>
	<form:option value="russia" label="RU"></form:option>
</form:select>
<br><br>
<input type="submit" value="submit"/> 
</form:form>

</body>
</html>