<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Handling request data</title>
</head>
<body>
	<h1>Handling request data</h1>
	<a href="register/hong">register/hong</a>
	<br>
	<a href="register/hong/100">register/hong/100</a>
	<br>
	<form action="/register01" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br> <input
			type="submit" value="register01">
	</form>
	<form action="/register02" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		coin: <input type="text" name="coin" value="100"><br> <input
			type="submit" value="register02">
	</form>
	<hr>
	<h1>@DateTimeFormat handling</h1>
	<a href="registerByDateFormat?userId=hong&dateOfBirth=20001020">registerByDateFormat?user
		Id=hong&ampdateOfBirth=20001020</a>
	<br>
	<a href="registerByDateFormat01?userId=hong&dateOfBirth=2000-10-
20">registerByDateFormat01?userId=hong&ampdateOfBirth=2000-10-20</a>
	<br>
	<a href="registerByDateFormat02?userId=hong&dateOfBirth=2000/10/20">registerByDateFormat0
		2?userId=hong&ampdateOfBirth=2000/10/20</a>
	<br>
	<a href="registerByDateFormat03?userId=hong&dateOfBirth=20001020">registerByDateFormat03?
		userId=hong&ampdateOfBirth=20001020</a>
	<br>
	<form action="/register" method="post">
		userId: <input type="text" name="userId" value="hong"><br>
		password: <input type="text" name="password" value="1234"><br>
		dateOfBirth: <input type="text" name="dateOfBirth" value="20001020"><br>
		<input type="submit" value="register">
	</form>
	<hr>
	<h2>Form modes</h2>
	<form action="/registerUserId" method="post">
		userId: <input type="text" name="userId" /><br> <input
			type="submit" value="registerUserId">
	</form>
	<form action="/registerMemberUserId" method="post">
		userId: <input type="text" name="userId" /><br> <input
			type="submit" value="registerMemberUserId">
	</form>
	<form action="/registerPassword" method="post">
		password: <input type="password" name="password" /><br> <input
			type="submit" value="registerPassword">
	</form>
	<form action="/registerRadio" method="post">
		gender: <br> <input type="radio" name="gender" value="male"
			checked> Male<br> <input type="radio" name="gender"
			value="female"> Female<br> <input type="radio"
			name="gender" value="other"> Other<br> <input
			type="submit" value="registerRadio">
	</form>
	<form action="/registerSelect" method="post">nationality:</form>
	<select name="nationality">
		<option value="Korea" selected>Korea</option>
		<option value="Germany">Germany</option>
		<option value="Australia">Australia</option>
		<option value="Canada">Canada</option>
	</select>
	<br>
	<input type="submit" value="registerSelect">

	<form action="/registerCheckbox01" method="post">
		hobby: <br> <input type="checkbox" name="hobby" value="Sports">
		Sports<br> <input type="checkbox" name="hobby" value="Music">
		Music<br> <input type="checkbox" name="hobby" value="Movie">
		Movie<br> <input type="submit" value="registerCheckbox01">
	</form>
	<form action="/registerCheckbox02" method="post">
		hobbyList: <br> <input type="checkbox" name="hobbyArray"
			value="Sports"> Sports<br> Music<br> Movie<br>
	</form>
	<input type="checkbox" name="hobbyArray" value="Music">
	<input type="checkbox" name="hobbyArray" value="Movie">
	<input type="submit" value="registerCheckbox02">
	<form action="/registerCheckbox03" method="post">
		developer: <input type="checkbox" name="developer" value="Y"><br>
		<input type="submit" value="registerCheckbox03">
	</form>
	<form action="/registerCheckbox04" method="post">
		foreigner: <input type="checkbox" name="foreigner" value="false"><br>
		<input type="submit" value="registerCheckbox04">
	</form>
	<form action="/registerAddress" method="post">
		postCode: <input type="text" name="postCode" /><br> location: <input
			type="text" name="location" /><br> <input type="submit"
			value="registerAddress">
	</form>
	<form action="/registerUserAddress" method="post">
		address.postCode: <input type="text" name="address.postCode" /><br>
		address.location: <input type="text" name="address.location" /><br>
		<input type="submit" value="registerUserAddress">
	</form>
	<form action="/registerTextArea" method="post">
		introduction: <br>
		<textarea name="introduction" rows="6" cols="50"></textarea>
		<br> <input type="submit" value="registerTextArea">
	</form>


</body>
</html>