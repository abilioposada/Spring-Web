<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Productos - Detalle</title>
</head>
<body>
	<header>
		<h1>Productos</h1>
		<h2>Detalle</h2>
	</header>
	
	<table border="1">
		<thead>
			<tr>
				<th>Propiedad</th>
				<th>Valor</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<th>Codigo</th>
				<td>${ producto.codigo }</td>
			</tr>
			<tr>
				<th>Nombre</th>
				<td>${ producto.nombre }</td>
			</tr>
			<tr>
				<th>Precio</th>
				<td>${ producto.precio }</td>
			</tr>
			<tr>
				<th>Fecha de vencimiento</th>
				<td>${ producto.vencimiento }</td>
			</tr>
			<tr>
				<th>Estado</th>
				<td>${ producto.estado }</td>
			</tr>
			<tr>
				<th>Propietario</th>
				<td>
					<a href="<c:url value='/usuarios/${ producto.idPropietario.id }' />">
						${ producto.idPropietario.nombre }
					</a>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>