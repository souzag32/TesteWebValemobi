<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Adiciona Mercadoria</title>
</head>
<body>
	<form action="AdicionarMercadoria.action" method="post">
		<table>
		<tr>
			<td>Tipo de Mercadoria:</td>
			<td><input type="text" name="tipo"></td>
		</tr>
		<tr>
			<td>Nome da Mercadoria:</td>
			<td><input type="text" name="nome"></td>
		</tr>
		<tr>
			<td>Quantidade:</td>
			<td><input type="text" name="quantidade"></td>
		</tr>
		<tr>
			<td>Preço da Mercadoria:</td>
			<td><input type="text" name="preco"></td>
		</tr>
		<tr>
			<td>Tipo de Negócio:</td>
			<td><input type="radio" name="tipoNegocio" value="COMPRA">Compra</td>
			<td><input type="radio" name="tipoNegocio" value="VENDA">Venda</td>
		</tr>
		<tr>
			<td><input type="submit" value="Adicionar"/></td>
		</tr>
	</table>
	</form>
</body>
</html>