package org.grupo7.conquerdaring.repository;

import java.util.List;
import java.util.Optional;

import org.grupo7.conquerdaring.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByEmail (String email);
	
	public List<Usuario> findAllByNomeContainingIgnoreCase (String nome);
	
}
