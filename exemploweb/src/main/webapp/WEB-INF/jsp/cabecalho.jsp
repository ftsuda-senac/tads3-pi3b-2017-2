<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<header style="background-color: #0f0">
  <h1>Exemplo Web - página protegida</h1>
  <h2><c:out value="${sessionScope.usuario.nomeCompleto}" /></h2>
</header>