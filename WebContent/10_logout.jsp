<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>

<body>
<form action="../logoutServlet">
<script>
<%
session.invalidate();

%>
alert("로그아웃되었습니다.");
location.href="10_loginForm.jsp";

</script>
</form>
</body>
</html>