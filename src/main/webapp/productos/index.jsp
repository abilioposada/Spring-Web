<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Productos - Listar</title>
</head>
<body>
	<header>
		<h1>Productos</h1>
		<h2>Listar</h2>
	</header>
	
	<a href="<c:url value='/productos/ingresar' />">Ingresar</a>
	
	<table border="1">
		<thead>
			<tr>
				<th>Nombre</th>
				<th>Precio</th>
				<th>Cantidad</th>
				<th>Vencimiento</th>
				<th>Estado</th>
				<th colspan="3">Opciones</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${listado}" var="producto">
				<tr>
					<td>${ producto.nombre }</td>
					<td>$${ producto.precio }</td>
					<td>${ producto.cantidad }</td>
					<td>${ producto.vencimiento }</td>
					<td>${ producto.estado }</td>
					<td><a href="<c:url value='/productos/${ producto.codigo }' />">Detalle</a>
					<td><a href="<c:url value='/productos/editar/${ producto.codigo }' />">Editar</a>
					<td><a href="<c:url value='/productos/eliminar/${ producto.codigo }' />">Eliminar</a>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>