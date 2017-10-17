/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.tads3.pi3b.exemploweb.autenticacao;

import br.senac.tads3.pi3b.exemploweb.entidade.UsuarioSistema;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author fernando.tsuda
 */
public class UsuarioSistemaServiceMock implements UsuarioSistemaService {

  private static final Map<String, UsuarioSistema> USUARIOS_MOCK;

  static {
    USUARIOS_MOCK = new LinkedHashMap<String, UsuarioSistema>();
    USUARIOS_MOCK.put("fulano", new UsuarioSistema("Fulano da Silva", "fulano",
	    "abcd1234", Arrays.asList("PEAO")));
    USUARIOS_MOCK.put("ciclano", new UsuarioSistema("Ciclano de Souza", "ciclano",
	    "abcd1234", Arrays.asList("PEAO", "CHEFE")));
    USUARIOS_MOCK.put("beltrana", new UsuarioSistema("Beltrana das Dores", "beltrana",
	    "abcd1234", Arrays.asList("PEAO", "CHEFE", "MESTRE")));
  }

  @Override
  public UsuarioSistema autenticar(String username, String senha) {
    UsuarioSistema usuario = USUARIOS_MOCK.get(username);
    if (usuario != null) {
      if (usuario.getHashSenha().equals(senha)) { // Comparacao de String - nao usar "=="
	return usuario;
      }
    }
    return null;
  }

  @Override
  public boolean autorizado(UsuarioSistema usuario, String funcionalidade) {
    return false;
  }

}
