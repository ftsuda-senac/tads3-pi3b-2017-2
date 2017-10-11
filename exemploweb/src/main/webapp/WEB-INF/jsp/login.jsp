<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Login</h1>
    <c:if test="${mensagemErro}">
      <p><c:out value="${mensagemErro}" /></p>
    </c:if>
    <div>
      <form action="${pageContext.request.contextPath}/login" method="post">
	<div>
	  <label>Username</label>
	  <input type="text" name="username" />
	</div>
	<div>
	  <label>Senha</label>
	  <input type="password" name="senha" />
	</div>
	<div>
	  <input type="submit" value="Enviar" />
	</div>
      </form>
    </div>
  </body>
</html>
