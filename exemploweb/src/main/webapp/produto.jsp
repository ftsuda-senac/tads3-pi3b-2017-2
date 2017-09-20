<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Produto</h1>
    <c:forEach items="${listaProd}" var="prod">
      <div>
	<p>Nome: <c:out value="${prod.getNome()}" /></p>
	<p>Descrição: <c:out value="${prod.getDescricao()}" /></p>
      </div>
      <hr />
    </c:forEach>
  </body>
</html>
