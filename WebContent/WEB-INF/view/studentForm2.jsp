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

country--
<form:select path="country">
	<form:options items="${mystudent.countryOptions}"/>
</form:select>
<br><br>



Java<form:radiobutton path="favoriteLanguage" value="java"/>
C#<form:radiobutton path="favoriteLanguage" value="C#"/>
PHP<form:radiobutton path="favoriteLanguage" value="PHP"/>
<br><br>
favorite OS--
linux<form:checkbox path="os" value="linux"/>
Mac<form:checkbox path="os" value="Mac"/>
Windows<form:checkbox path="os" value="Windows"/>

<input type="submit" value="submit"/> 
</form:form>
</body>
</html>