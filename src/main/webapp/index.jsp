
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Servlets e JSTL</title>
</head>
<body>
	<div>
	<form action="pessoa" method="post">
		<table>
		<tr>
		<td><input type:"number" id="id" name="id" placeholder="#Id" requeired="requiered">
		</tr>
		<tr>
		<td><input type="text" id="nome" name="nome" placeholder="Nome" requeired="requiered">
		</tr>
		<tr>
		<td><input type="submit" id="enviar" name="enviar" value="Enviar"></td>
		</tr>
		</table>
		</form>
	</div>
	<br />
	<!-- 	<% int i = 0;
		   for (int j=0; j<10; j++) {
			   out.println(i*2);
			   i++;
			   %>
			   <br />
			   <%
		   }
			   %>
		<c:if test="${empty pessoa}">
		<p>Sem pessoa</p>
		</c:if>
		-->
		<div>
		<c:if test="${not empty pessoa}">
		<c:out value="${pessoa.nome}" />
		</c:if>
		</div>
</body>
</html>