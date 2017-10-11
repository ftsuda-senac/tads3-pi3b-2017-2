/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb;

import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    RequestDispatcher dispatcher
	    = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
    dispatcher.forward(request, response);

  }

  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
	  throws ServletException, IOException {
    String username = request.getParameter("username");
    String senha = request.getParameter("senha");
    HttpSession sessao = request.getSession();
    sessao.setAttribute("username", username);

    if ("fodao".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Fodão");
      response.sendRedirect(request.getContextPath() + "/protegido/resultado");
    } else if ("fodinha".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Fodinha");
      response.sendRedirect(request.getContextPath() + "/protegido/resultado");
    } else if ("normal".equals(username) && "1234".equals(senha)) {
      sessao.setAttribute("nome", "Usuário Normal");
      response.sendRedirect(request.getContextPath() + "/protegido/resultado");
    } else { // Usuario inválido
      request.setAttribute("mensagemErro", "Usuário ou senha inválido");
      RequestDispatcher dispatcher
	      = request.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
      dispatcher.forward(request, response);
    }

  }

}
