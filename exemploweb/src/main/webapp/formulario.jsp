<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <title>TODO supply a title</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
  </head>
  <body>
    <h1>Formulário produto</h1>
    <div>
      <form action="${pageContext.request.contextPath}/cadastro-produto" method="post">
	<div>
	  <label for="txtnome">Nome</label>
	  <input type="text" name="nome" id="txtnome"/>
	</div>
	<div>
	  <label>Descrição</label>
	  <textarea name="descricao"></textarea>
	</div>
	<div>
	  <label>Valor compra</label>
	  <input type="number" name="vlcompra" />
	</div>
	<div>
	  <label>Valor venda</label>
	  <input type="number" name="vlvenda" />
	</div>
	<div>
	  <label>Categorias</label>
	  <label><input type="checkbox" name="categorias" 
			value="higiene-pessoal"> Higiene pessoal</label>
	  <label><input type="checkbox" name="categorias" 
			value="alimentos"> Alimentos</label>
	  <label><input type="checkbox" name="categorias" 
			value="limpeza"> Limpeza</label>
	  <label><input type="checkbox" name="categorias" 
			value="eletrodomesticos"> Eletrodomésticos</label>
	</div>
	<div>
	  <label>Disponível para venda</label>
	  <label><input type="radio" name="disponivel" 
			value="s" /> Sim</label>
	  <label><input type="radio" name="disponivel" 
			value="n" /> Não</label>
	</div>
	<div>
	  <button type="submit">Salvar</button>
	  <button type="reset">Limpar</button>
	</div>
      </form>
      
    </div>
  </body>
</html>
