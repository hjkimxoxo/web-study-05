<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
session.setAttribute("s_name1", "세션 첫번째값");
session.setAttribute("s_name2", "세션 두번째값");
session.setAttribute("s_name3", "세션 세번째값");

out.print("<h3> 세션값 삭제전 </h3>");
Enumeration names;
names = session.getAttributeNames();
while(names.hasMoreElements()){
	String name=names.nextElement().toString();
	String value = session.getAttribute(name).toString();
	out.println(name + ":" + value + "<br>");
}
//제거 
session.removeAttribute("s_name2");

out.print("<hr><h3>세션값 삭제후</h3>");
names = session.getAttributeNames();
while(names.hasMoreElements()){
	String name=names.nextElement().toString();
	String value = session.getAttribute(name).toString();
	out.println(name + ":" + value + "<br>");
}
	
//모두제거 
session.invalidate();
out.print("<h3>세션값 모두 삭제</h3>");
out.print("Q.세션아이디 유효할까요?<br>");
if(request.isRequestedSessionIdValid()==true){
	out.print("유효합니다<hr>");
}else{
	out.print("유효하지않습니다<hr>");
}
%>


</body>
</html>