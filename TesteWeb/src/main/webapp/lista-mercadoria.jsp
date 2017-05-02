<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="resources/css/estilo.css">
<title>Lista Mercadoria</title>
</head>
<body>
	<h1>Lista de Mercadorias</h1>
	<a href="adiciona-mercadoria.jsp"><button>Adicionar Mercadoria</button></a>
	<br/>
	<br/>
	<table>
		<tr>
			<th>Código do produto</th>
			<th>Tipo da Mercadoria</th>
			<th>Nome</th>
			<th>Preço</th>
			<th>Quantidade</th>
			<th>Tipo do Negócio</th>
		</tr>
		<c:forEach var="mercadoria" items="${mercadorias}">
			<tr>
				<td>${mercadoria.codigoMercadoria}</td>
				<td>${mercadoria.tipoMercadoria}</td>
				<td>${mercadoria.nomeMercadoria}</td>
				<td>${mercadoria.preco}</td>
				<td>${mercadoria.quantidade}</td>
				<td>${mercadoria.tipoNegocio}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>