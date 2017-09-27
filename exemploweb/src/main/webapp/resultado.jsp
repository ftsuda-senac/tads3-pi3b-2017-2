<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Resultado do submit</h1>
    <div>
      <div><label>Nome:</label> <c:out value="${prod.nome}" /></div>
      <div><label>Descrição:</label> <c:out value="${prod.descricao}" /></div>
      <div><label>Vl compra</label> <c:out value="${prod.valorCompra}" /></div>
      <div><label>Vl venda</label> <c:out value="${prod.valorVenda}" /></div>
      <div><label>Dt cadastro</label> <c:out value="${prod.dtCadastro}" /></div>
      <div><label>Categorias</label> <c:out value="${prod.categorias}" /></div>
      <div><label>Disponível</label> <c:out value="${disponivel}" /></div>
    </div>
  </body>
</html>
