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

	Lista de produtos cadastrados:

	<ol>
		<c:forEach items="${produtos}" var="produto">
			<li>${produto.nome} - ${produto.descricao} - ${produto.idCategoria} -  
			<a href="/loja-virtual/produto?param=RemoveProduto&id=${produto.id}">remover</a> 
			<a href="/loja-virtual/produto?param=MostraProduto&id=${produto.id}">editar</a>
			</li>
		</c:forEach>
	</ol>
	
	<a href="/loja-virtual/novoProduto">Novo</a>
	
	
	

</body>
</html>