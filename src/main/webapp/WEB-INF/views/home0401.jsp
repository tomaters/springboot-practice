<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home0401</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>\${coin == 1000 && userId == "yes"}</td>
			<td>${coin == 1000 && userId == "yes"}</td>
		</tr>
		<tr>
			<td>\${coin == 1000 and userId eq "yes"}</td>
			<td>${coin == 1000 and userId eq "yes"}</td>
		</tr>
		<tr>
			<td>\${not empty member && userId eq "yes"}</td>
			<td>${not empty member && userId eq "yes"}</td>
		</tr>
		<tr>
			<td>\${! empty member && userId eq "yes"}</td>
			<td>${! empty member && userId eq "yes"}</td>
		</tr>
	</table>
</body>
</html>