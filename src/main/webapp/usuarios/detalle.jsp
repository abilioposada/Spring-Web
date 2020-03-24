<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8" />
	<title>Usuarios - Detalle</title>
</head>
<body>
	<header>
		<h1>Usuarios</h1>
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
				<th>ID</th>
				<td>${ usuario.id }</td>
			</tr>
			<tr>
				<th>Nombre</th>
				<td>${ usuario.nombre }</td>
			</tr>
			<tr>
				<th>Usuario</th>
				<td>${ usuario.usuario }</td>
			</tr>
			<tr>
				<th>Estado</th>
				<td>${ usuario.estado }</td>
			</tr>
			<tr>
				<th>Rol</th>
				<td>${ usuario.rol }</td>
			</tr>
			<tr>
				<th>Productos</th>
				<td>
					<table>
						<c:forEach items="${ usuario.productos }" var="producto">
							<tr>
								<td>
									<a href="<c:url value='/productos/${ producto.codigo }' />">
										${ producto.nombre }
									</a>
								</td>
							</tr>
						</c:forEach>
					</table>
				</td>
			</tr>
		</tbody>
	</table>
</body>
</html>