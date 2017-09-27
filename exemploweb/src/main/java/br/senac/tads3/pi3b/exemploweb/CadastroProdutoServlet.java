/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Date;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "CadastroProdutoServlet", urlPatterns = {"/cadastro-produto"})
public class CadastroProdutoServlet extends HttpServlet {

  /**
   * Handles the HTTP <code>GET</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {

    String destino;

    HttpSession sessao = request.getSession();
    if (sessao.getAttribute("prod") != null) {
      request.setAttribute("prod", sessao.getAttribute("prod"));
      // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
      sessao.removeAttribute("prod");

      request.setAttribute("disponivel", sessao.getAttribute("disponivel"));
      // Remove o atributo da sessao para usuario nao ficar preso na tela de resultados
      sessao.removeAttribute("disponivel");

      destino = "resultado.jsp";
    } else {
      destino = "formulario.jsp";
    }

    RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
    dispatcher.forward(request, response);
  }

  /**
   * Handles the HTTP <code>POST</code> method.
   *
   * @param request servlet request
   * @param response servlet response
   * @throws ServletException if a servlet-specific error occurs
   * @throws IOException if an I/O error occurs
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    String nome = request.getParameter("nome");
    String desc = request.getParameter("descricao");
    String vlCompra = request.getParameter("vlcompra");
    String vlVenda = request.getParameter("vlvenda");
    String[] categorias = request.getParameterValues("categorias");
    String disponivel = request.getParameter("disponivel");

    BigDecimal vlCompraDecimal = new BigDecimal(vlCompra);
    BigDecimal vlVendaDecimal = new BigDecimal(vlVenda);

    Produto p = new Produto();
    p.setNome(nome);
    p.setDescricao(desc);
    p.setValorCompra(vlCompraDecimal);
    p.setValorVenda(vlVendaDecimal);
    p.setCategorias(Arrays.toString(categorias));
    p.setDtCadastro(new Date());

    HttpSession sessao = request.getSession();
    sessao.setAttribute("prod", p);
    sessao.setAttribute("disponivel", disponivel);

    response.sendRedirect(request.getContextPath() + "/cadastro-produto");
  }

}
