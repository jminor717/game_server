<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
	<head>
		<title>Game</title>
		<style type="text/css">
		.error {
			color: red;
		}
		
	
		body {
		background-color: grey;
		
		}
		
		
		#banner{
		top:0px;
		left:0px;
		position:fixed;
		margin-right:200px;
		cursor: pointer;
		min-width:1000px;
		height: 100px;
		width:100%;
		 font-size: 400%;
		color: FF0000;
		background-color: #C0C0C0 ;
		}
		p{
			padding:100px;
			margin:0;
		}
		b{
		border-style: solid;
		border-width: 5px;
		}
		
		
		</style>
	</head>

	<body>
	
	<p>
	</p>
	<box>
	
	<div align = "center">	
	<c:if test="${! empty errorMessage}">
			<div class="error">${errorMessage}</div>
		</c:if>
	</div>
	
	<div align = "center">	
	<c:if test="${! empty userErrorMessage}">
			<div class="error">${userErrorMessage}</div>
		</c:if>
	</div>
	
	
	<div align = "center">	
	<c:if test="${! empty passErrorMessage}">
			<div class="error">${passErrorMessage}</div>
		</c:if>
	</div>
	
	
	<div align = "center">	
	<c:if test="${! empty emailErrorMessage}">
			<div class="error">${emailErrorMessage}</div>
		</c:if>
	</div>
	
	
	
	<div id="banner">
	this is the title of our website (img)	
	</div> 
		
	<form border-width = "5" action="${pageContext.servletContext.contextPath}/newuser" method="post" align = "center">
  	
  	Username:<br>
  	<input type="text" name="username" value="${username}"><br>
  	
	
  	Password:<br> 
  	<input type="text" name="password" value="${password}">
	<br>
	
	Confirm Password:<br> 
  	<input type="text" name="rpass" value="${rpass}">
	<br>
	
	Email:<br>   
	<input type="text" name="email" value="${email}">
	<br> 
	
	
	Confirm Email:<br>   
	<input type="text" name="remail" value="${remail}">
	<br>
	<br>
	
	
	<input type="submit" name="submit" value="Create Account">
	
	</form>
	<form action="${pageContext.servletContext.contextPath}/index" method="get" align = "center">
	<input type="submit" name="home" value="Home">
	</form>
	
	</box>

	
	
	</body>
</html>