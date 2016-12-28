<%-- 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<%@ include file="include/header.jsp" %>

	<!-- Main Content -->
	<section class="content">
		<div class="row">
			<!-- left column -->
			<div class="col-md-12">
				<!--  general form elements -->
				
				<div class="box">
					<div class="box-header with-border">
						<h3 class="box-title">HOME PAGE</h3>
					</div>
				</div>
			</div>
		</div>
	</section>
	
<%@ include file="include/footer.jsp" %>
 --%>




<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title>Home</title>
</head>
<body>

	<h1>Hello world!</h1>
	
	<P>  The time on the server is ${serverTime}. </P>
	
	<h2>${result}</h2>
	
</body>
</html>
