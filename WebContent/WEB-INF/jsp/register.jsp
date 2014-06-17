<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form method="post">
		username:<input type="text" name="username" value="{user.name}"/><br>
		password:<input type="text" name="password" value="{user.password}"/><br>
		city: <select name="city">
				<c:forEach items="${cityList}" var="city">
					<option value="${city}">${city}</option>
				</c:forEach>
				</select>
			<input type="submit" value="注册">
			<input type="submit" value="取消" name="_cancel">
	</form>
</body>
</html>