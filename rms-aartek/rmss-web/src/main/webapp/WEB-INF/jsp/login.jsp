<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
</head>
<body>
<form:form method="POST" action="loginUser.do" modelAttribute="UserLogin" autocomplete="off"> 
<table width="100%">
<tr>
<td><div>
UserName
<form:input path="userId" class="inputControl" placeholder="Please enter your email"
                    required="autofocus" maxlength="50" id="emailId" /></div>
</td>
</tr>
<tr>
<td><div>
Password
<form:input path="password" class="inputControl" placeholder="Please enter your password"
                    required="autofocus" maxlength="50" id="password" /></div>
</td>
</tr>
<tr>
<td>
<input type="submit" value="submit" class="btn lg-btn"  />
</td>
</tr>
<tr>
            <td><div class="form-control">
                <label>
                   <small class="required"></small>
                 <input type="checkbox" id="rememberMe" /> Remember Me</label>
                 &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                 <label>
                  <a href="register.do" >Register Here</a></label> 
              </div></td>
          </tr>
</table>


</form:form>

</body>

</html>