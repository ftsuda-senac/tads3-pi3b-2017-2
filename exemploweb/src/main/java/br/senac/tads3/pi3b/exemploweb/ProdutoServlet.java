/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fernando.tsuda
 */
@WebServlet(name = "ProdutoServlet", urlPatterns = {"/produto"})
public class ProdutoServlet extends HttpServlet {

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

    Produto p1 = new Produto("Chocolate", "descrição do produto",
	    new BigDecimal(9.80), new BigDecimal(12.00),
	    "alimento", new Date());
    Produto p2 = new Produto("Arroz", "descrição do produto",
	    new BigDecimal(20.80), new BigDecimal(30.10),
	    "alimento", new Date());
    Produto p3 = new Produto("Feijão", "descrição do produto",
	    new BigDecimal(15.80), new BigDecimal(25.30),
	    "alimento", new Date());
    Produto p4 = new Produto("Atum", "descrição do produto",
	    new BigDecimal(6.90), new BigDecimal(9.00),
	    "alimento", new Date());
    List<Produto> lista = new ArrayList<Produto>();
    lista.add(p1);
    lista.add(p2);
    lista.add(p3);
    lista.add(p4);
    
    request.setAttribute("listaProd", lista);
    RequestDispatcher dispatcher = request.getRequestDispatcher("produto.jsp");
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

  }

}
