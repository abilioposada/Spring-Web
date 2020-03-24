<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Inicio</title>
</head>
<body>
	<header>
		<h1>Inicio</h1>
		<h2>Tablas</h2>
	</header>
	
	<ul>
		<li>
			<a href="<c:url value='/usuarios' />">Usuarios</a>
		</li>
		<li>
			<a href="<c:url value='/productos' />">Productos</a>
		</li>
	</ul>
</body>
</html>