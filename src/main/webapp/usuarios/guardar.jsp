<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Usuarios - Guardar</title>
</head>
<body>
	<header>
		<h1>Usuarios</h1>
		<h2>Guardar</h2>
	</header>
	<form action="<c:url value='/usuarios/guardar' />" method="post">
		<input type="hidden" name="id" value="${ usuario.id }" />
		<input name="nombre" value="${ usuario.nombre }" placeholder="Nombre" />
		<input name="usuario" value="${ usuario.usuario }" placeholder="Usuario" />
		<input name="clave" placeholder="Clave" />
		<select name="estado">
			<option>Habilitado</option>
			<option>Inhabilitado</option>
		</select>
		<select name="rol">
			<option>Administrador</option>
			<option>Estandar</option>
		</select>
		<input type="submit" value="Guardar" />
	</form>
</body>
</html>