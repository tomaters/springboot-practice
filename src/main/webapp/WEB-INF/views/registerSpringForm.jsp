<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Spring form</title>
</head>
<body>
	<h2>Spring form display</h2>
	<form:form modelAttribute="member" method="post" action="register">
		<table>
			<tr>
				<td>
					userID: 
				</td>
				<td>
					<form:input path="userId"/>
					<font color="red">
						<form:errors path="userId"></form:errors>
					</font>
				</td>
			</tr>
			<tr>
				<td>
					userName: 
				</td>
				<td>
					<form:input path="userName"/>
					<font color="red">
						<form:errors path="userName"></form:errors>
					</font>
				</td>
			</tr>
		</table>
		<form:button name="register">Submit</form:button>
	</form:form>
</body>
</html>