<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
</head>
<body>
<form:form method="POST" action="registerUser.do" modelAttribute="Register" autocomplete="off"> 

<table width="100%">
<tr>
<td>
Registration Id:
<form:input path="registrationId" class="inputControl" placeholder="Please enter your id"
                    required="autofocus" maxlength="50"  />
                    <form:errors path="firstName"  class="label error-label"></form:errors>
</td>
</tr>
<tr>
<td>
First Name:
<form:input path="firstName" class="inputControl" placeholder="Please enter your firstname"
                    required="autofocus" maxlength="50"  />
                    <form:errors path="firstName"  class="label error-label"></form:errors>
                    
</td>
</tr>
<tr>
<td>
Last Name:
<form:input path="lastName" class="inputControl" placeholder="Please enter your lastname"
                    required="autofocus" maxlength="50"  />
                    <form:errors path="lastName"  class="label error-label"></form:errors>
</td>
</tr>
<tr>
<td>
Email Id:
<form:input path="emailId" class="inputControl" placeholder="Please enter your emailid"
                    required="autofocus" maxlength="50"  />
                    <form:errors path="emailId"  class="label error-label"></form:errors>
</td>
</tr>
<tr>
<td>
Date of Birth: 
<form:input path="dateOfBirth" class="inputControl" placeholder="Please enter your Date of Birth"
                    required="autofocus" maxlength="50"  />
                    <form:errors path="dateOfBirth"  class="label error-label"></form:errors>
</td>
</tr>
<tr>
<td>
Qualification: 
<form:input path="qualification" class="inputControl" placeholder="Please enter your Qualification"
                    required="autofocus" maxlength="50"  />
</td>
</tr>
<tr>
<td>
City: 
<form:input path="city" class="inputControl" placeholder="Please enter your city"
                    required="autofocus" maxlength="50"  />
</td>
</tr>
<tr>
<td>
State: 
<form:input path="state" class="inputControl" placeholder="Please enter your state"
                    required="autofocus" maxlength="50"  />
</td>
</tr>


<tr>
<td>
<input type="submit" value="Register" class="btn lg-btn"  />
</td>
</tr>
</table>


</form:form>

</body>

</html>