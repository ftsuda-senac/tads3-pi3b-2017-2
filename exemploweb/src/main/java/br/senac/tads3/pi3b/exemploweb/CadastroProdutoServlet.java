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
    RequestDispatcher dispatcher = request.getRequestDispatcher("formulario.jsp");
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
    
    request.setAttribute("prod", p);
    request.setAttribute("disponivel", disponivel);
    RequestDispatcher dispatcher = request.getRequestDispatcher("resultado.jsp");
    dispatcher.forward(request, response);
  }

}
