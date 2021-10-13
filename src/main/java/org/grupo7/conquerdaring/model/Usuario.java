package org.grupo7.conquerdaring.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuarios" )
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String nome;
	
	@NotNull
	@Size(min = 2, max = 50, message = "O atributo nome é obrigatório, deve conter no minimo 02 e no maximo 100 caracteres")
	private String email;
	
	@NotNull
	@Size(min = 5, max = 10, message = "O atributo nome é obrigatório, deve conter no minimo 05 e no maximo 10 caracteres")
	private String senha;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produto;
	
	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}

<<<<<<< HEAD
	public String getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
=======
>>>>>>> a32316091a4655a307149f100a98bb3f406b9b8a
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
