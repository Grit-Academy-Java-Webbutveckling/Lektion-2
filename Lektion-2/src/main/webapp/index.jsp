<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div>
	<form action="read-page.jsp" method="POST">
		<input type="text" name="fname" placeholder="First name"/>
		<select name="stuff">
			<option value="One">1</option>
			<option value="Two">2</option>
		</select>
		<input type="submit" value="Get-Request" />
	</form>
</div>

</body>
</html>