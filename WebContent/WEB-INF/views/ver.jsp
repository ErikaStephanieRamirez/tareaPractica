<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Mostrar</title>
</head>
<body>

	<br>
	<table border="1">
	
		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>NIT</th>
			<th>Importancia</th>
			<th>fecha</th>
		</tr>
		<c:forEach items="${contribuyentes}" var="cont">
			<tr>
				<th>${cont.nombre}</th>
				<th>${cont.apellido}</th>
				<th>${cont.nit}</th>
				<th>${cont.importancia.importancia}</th>
				<th>${cont.fechaDelegate}</th>
			</tr>
		</c:forEach>
	</table>
</body>
</html>