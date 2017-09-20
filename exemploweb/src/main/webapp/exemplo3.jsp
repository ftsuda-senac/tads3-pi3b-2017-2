<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Exemplo JSTL - forEach</h1>
    <h2><%= request.getRemoteAddr()%></h2>

    <c:forEach begin="1" end="100" varStatus="i">
      <c:choose>
	<c:when test="${i.count % 3 == 0}">
	  <p style="color: red">Mensagem <c:out value="${i.count}" /></p>
	</c:when>
	<c:when test="${i.count % 3 == 1}">
	  <p style="color: blue">Mensagem <c:out value="${i.count}" /></p>
	</c:when>
	<c:otherwise>
	  <p style="color: green">Mensagem <c:out value="${i.count}" /></p>
	</c:otherwise>
      </c:choose>

    </c:forEach>

  </body>
</html>
