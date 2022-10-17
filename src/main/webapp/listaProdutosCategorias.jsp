<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="br.com.fiap.jdbc.*, java.util.List"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produtos</title>
</head>
<body>

	Relatório de produtos cadastrados por categoria:
	<br>
	<table border="1">
		<tr>
			<c:forEach items="${categorias}" var="categoria">
			<tr><td>Categoria <br> 
					${categoria.nome}</td>
						<c:forEach items="${categoria.produtos}" var="categoriaProduto">
						<td>Produto <br>
							${categoriaProduto.nome}</td> 
						</c:forEach>
			</tr>
			</c:forEach>
		</tr>
	</table>





</body>
</html>