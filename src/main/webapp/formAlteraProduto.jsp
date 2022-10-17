<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Altera Produto</title>
</head>
<body>

	<form action="/loja-virtual/alteraProduto"  method="post">
		<label>Produto</label> <br>
		<input type=text name="nome" value="${produto.nome}"><br>  
		<label>Descrição</label> <br>
		<input type=text name="descricao" value="${produto.descricao}"><br>  
		<label>Categoria</label><br> 
		<input type=text name="categoria" value="${produto.idCategoria}"><br>
		<input type="hidden" name="id" value="${produto.idProduto}"><br> 
		<input type=submit name="enviar" value="Enviar">
	</form>


</body>
</html>