<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Usuarios - Listar</title>
</head>
<body>
	<header>
		<h1>Usuarios</h1>
		<h2>Listar</h2>
	</header>
	
	<a href="<c:url value='/usuarios/ingresar' />">Ingresar</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Usuario</th>
				<th>Rol</th>
				<th>Estado</th>
				<th colspan="3">Opciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listado}" var="usuario">
				<tr>
					<td>${ usuario.nombre }</td>
					<td>${ usuario.usuario }</td>
					<td>${ usuario.rol }</td>
					<td>${ usuario.estado }</td>
					<td><a href="<c:url value='/usuarios/${ usuario.id }' />">Detalle</a>
					<td><a href="<c:url value='/usuarios/editar/${ usuario.id }' />">Editar</a>
					<td><a href="<c:url value='/usuarios/eliminar/${ usuario.id }' />">Eliminar</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>