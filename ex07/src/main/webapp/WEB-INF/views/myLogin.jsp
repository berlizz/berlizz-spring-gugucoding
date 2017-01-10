<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.util.Enumeration" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Spring Security Custom Login Form</h1>
	<div id="login-box">
		
		<h2>Login With Username and Password</h2>
		
		<c:if test="${not empty error}">
		<div class="error">${error}</div>
		</c:if>
		<c:if test="${not empty msg}">
		<div class="msg">${msg}</div>
		</c:if>
		
		<form name="loginForm" action="/login" method="post">
			<table>
				<tr>
					<td>User : </td>
					<td><input type="text" name="username"></td>
				</tr>
				<tr>
					<td>Password : </td>
					<td><input type="password" name="password"></td>
				</tr>
				<tr>
					<td colspan="2"><input type="submit" value="submit">
				</tr>
			</table>
			
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}">
		</form>
		
	</div>
	
	
	<ul>
		<%
		Enumeration<String> en = session.getAttributeNames();
		while(en.hasMoreElements()) {
			String name = en.nextElement();
			Object obj = session.getAttribute(name);
			
			out.print("<li>" + obj + "</li>");
		}
		%>
	</ul>

</body>
</html>