/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb.autenticacao;

import br.senac.tads3.pi3b.exemploweb.entidade.UsuarioSistema;

/**
 *
 * @author fernando.tsuda
 */
public interface UsuarioSistemaService {
  
  public UsuarioSistema autenticar(String username, String senha);
  
  public boolean autorizado(UsuarioSistema usuario, String funcionalidade);
  
}
