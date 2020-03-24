<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8" />
		<title>Productos - Guardar</title>
	</head>
	<body>
		<header>
			<h1>Productos</h1>
			<h2>Guardar</h2>
		</header>
		<form action="<c:url value='/productos/guardar' />" method="post">
			<input name="codigo" value="${ producto.codigo }" required />
			<input name="nombre" value="${ producto.nombre }" placeholder="Nombre" required />
			<input name="precio" value="${ producto.precio }" placeholder="Precio" type="number" min=".01" step=".01" />
			<input name="cantidad" value="${ producto.cantidad }" placeholder="Cantidad" type="number" min="1" />
			<!-- <input name="vencimiento" value="${ producto.vencimiento }" type="date" /> -->
			<select name="idPropietario.id">
				<c:forEach items="${ usuarios }" var="usuario">
					<option value="${ usuario.id }">${ usuario.nombre }</option>
				</c:forEach>
			</select>
			<select name="estado">
				<option>Disponible</option>
				<option>Indisponible</option>
			</select>
			<input type="submit" value="Guardar" />
		</form>
	</body>
</html>