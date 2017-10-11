<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <header style="background-color: #ccc">
      <h1>Exemplo Web - página protegida</h1>
      <h2><c:out value="${sessionScope.nome}" /></h2>
    </header>
    <div>
      <h1>Conteúdo da página</h1>
    </div>
    <footer>
      <p>&copy; Senac 2017</p>
    </footer>
 </body>
</html>
