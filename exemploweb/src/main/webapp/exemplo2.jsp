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
      <p>Mensagem <c:out value="${i.count}" /> 
	<c:if test="${i.count % 2 == 0}">
	  <span>Número par</span>
	</c:if>
      </p>
    </c:forEach>

  </body>
</html>
