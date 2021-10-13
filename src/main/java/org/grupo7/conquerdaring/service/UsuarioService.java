package org.grupo7.conquerdaring.service;

import java.util.List;
import java.util.Optional;

import org.grupo7.conquerdaring.model.Usuario;
import org.grupo7.conquerdaring.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
		
	}
	
	public Optional<Usuario> cadastrarUsuario( Usuario usuario) {
		
		
	}
}
