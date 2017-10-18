/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb;

import br.senac.tads3.pi3b.exemploweb.autenticacao.UsuarioSistemaService;
import br.senac.tads3.pi3b.exemploweb.autenticacao.UsuarioSistemaServiceMock;
import br.senac.tads3.pi3b.exemploweb.entidade.UsuarioSistema;
import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebFilter(filterName = "AutorizacaoFilter",
	servletNames = {"CadastroProdutoServlet"},
	urlPatterns = {"/protegido/*"})
public class AutorizacaoFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest request,
	  ServletResponse response, FilterChain chain)
	  throws IOException, ServletException {
    HttpServletRequest httpRequest = (HttpServletRequest) request; // cast
    HttpServletResponse httpResponse = (HttpServletResponse) response;

    HttpSession sessao = httpRequest.getSession();
    if (sessao != null && sessao.getAttribute("usuario") != null) {
      // Usuario esta logado
      
      UsuarioSistema usuario = (UsuarioSistema) sessao.getAttribute("usuario");
      UsuarioSistemaService service = new UsuarioSistemaServiceMock();
      
      String paginaAcessada = httpRequest.getRequestURI();
      String funcionalidade = 
	      paginaAcessada.replace(httpRequest.getContextPath(), "");
      
      if (service.autorizado(usuario, funcionalidade)) {
	chain.doFilter(request, response); // Comando que deixa requisição passar para proximo elemento.
      } else {
	httpResponse.sendRedirect(httpRequest.getContextPath() + "/erro-nao-autorizado.jsp");
      }
    } else {
      httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
      return;
    }
  }

  @Override
  public void destroy() {

  }

}
