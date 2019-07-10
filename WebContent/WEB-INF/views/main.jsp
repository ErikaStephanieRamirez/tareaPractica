<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insertar</title>
</head>
<body>
	<div align="center">
	<form:form action="${pageContext.request.contextPath}/Guardar" method="post" modelAttribute="ContribuyenteDTO">

		<label>Nombre: </label>
		<form:input type="text" path="Nombre" />
		<form:errors path="Nombre" cssStyle="color:#E81505;"></form:errors>
		<br><br>


		<label>Apellido: </label>
		<form:input type="text" path="Apellido" />
		<form:errors path="Apellido" cssStyle="color:#E81505;"></form:errors>
		<br><br>
	
		<label>NIT: </label>
		<form:input type="text" path="Nit" />
		<form:errors path="Nit" cssStyle="color:#E81505;"></form:errors>
		<br><br>

		<label>Importancia: </label>
		<form:select path="Importancia" name="importancia">
			<c:forEach items="${importancia}" var="importancia">
				<option value="${importancia.c_importancia}">${importancia.importancia}</option>
			</c:forEach>
		</form:select>
		<br>
		<br>

		<input type="Submit" value="Guardar">

	</form:form>
	<br>
	<form:form action="${pageContext.request.contextPath}/verTodos" method="post">
		<input type="submit" value="Ver Contribuyentes">
	</form:form>
	</div>
</body>
</html>