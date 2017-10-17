/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb.entidade;

import java.util.List;

/**
 *
 * @author fernando.tsuda
 */
public class UsuarioSistema {
  
  private String nomeCompleto;
  
  private String username;
  
  private String hashSenha;
  
  private List<String> papeis;
  
  private UsuarioSistema() {
    
  }

  public UsuarioSistema(String nomeCompleto, String username, String hashSenha, List<String> papeis) {
    this.nomeCompleto = nomeCompleto;
    this.username = username;
    this.hashSenha = hashSenha;
    this.papeis = papeis;
  }


  public String getNomeCompleto() {
    return nomeCompleto;
  }

  public void setNomeCompleto(String nomeCompleto) {
    this.nomeCompleto = nomeCompleto;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getHashSenha() {
    return hashSenha;
  }

  public void setHashSenha(String hashSenha) {
    this.hashSenha = hashSenha;
  }

  public List<String> getPapeis() {
    return papeis;
  }

  public void setPapeis(List<String> papeis) {
    this.papeis = papeis;
  }
  
}
