package org.grupo7.conquerdaring.controller;

import java.util.List;
import java.util.Optional;


import org.grupo7.conquerdaring.model.Usuario;
import org.grupo7.conquerdaring.model.UsuarioLogin;
import org.grupo7.conquerdaring.repository.UsuarioRepository;
import org.grupo7.conquerdaring.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/all")
	public ResponseEntity <List<Usuario>> getAll() {
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
	@PostMapping("/logar")
	public ResponseEntity<UsuarioLogin> loginUsuario(@RequestBody Optional <UsuarioLogin> usuarioLogin){
		
		return usuarioService.autenticarUsuario(usuarioLogin)
			.map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.UNAUTHORIZED).build());
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Usuario> postUsuario(@RequestBody Usuario usuario){
		
		return usuarioService.cadastrarUsuario(usuario)
			.map(resp -> ResponseEntity.status(HttpStatus.CREATED).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<Usuario> putUsuario(@RequestBody Usuario usuario){
		
		return usuarioService.atualizarUsuario(usuario)
			.map(resp -> ResponseEntity.status(HttpStatus.OK).body(resp))
			.orElse(ResponseEntity.status(HttpStatus.BAD_REQUEST).build());
	} 
}
