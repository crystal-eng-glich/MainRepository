<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>首页</title>
</head>
<body>
	<h1>查询结果</h1>
	<table>
		<tr>
			<th>用户名</th>
			<th>密码</th>
			<th>性别</th>
		</tr>	
		<c:forEach var="item" items="${result}">
			<tr>
				<td>${item.username}</td>
				<td>${item.password}</td>
				<td>${item.id}</td>
				<td>${item.birthday}</td>
				<td>${item.gender}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>