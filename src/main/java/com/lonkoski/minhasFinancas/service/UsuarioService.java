package com.lonkoski.minhasFinancas.service;

import java.util.Optional;

import com.lonkoski.minhasFinancas.model.entity.Usuario;

public interface UsuarioService {
	
	Usuario autenticar(String email, String senha);
	
	Usuario salvarUsuario(Usuario usuario );
	
	void validarEmail(String email);
	
	Optional<Usuario> obtePorId(Long id); 
	
}
