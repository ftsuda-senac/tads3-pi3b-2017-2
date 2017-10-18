<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/estilos.css" />
  </head>
  <body>
    <c:import url="/WEB-INF/jsp/cabecalho.jsp" />
    <div>
      <h1>Conteúdo da página</h1>
      <ul>
	<li>Opção 1</li>
	<li>Opção 2</li>
	<li>Opção 3</li>
	<c:if test="${sessionScope.usuario.temPapel('CHEFE')}">
	<li>
	  <a href="${pageContext.request.contextPath}/cadastro-produto">Cadastro produto</a>
	</li>
	  <li>Opção 5</li>
	  <li>Opção 6</li>
	</c:if>
	<c:if test="${sessionScope.usuario.temPapel('MESTRE')}">
	  <li>Opção 7</li>
	</c:if>
      </ul>
      
    </div>
     <c:import url="/WEB-INF/jsp/rodape.jsp" />
 </body>
</html>
