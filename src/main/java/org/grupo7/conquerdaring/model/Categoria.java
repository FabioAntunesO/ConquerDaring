package org.grupo7.conquerdaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 3 , max = 30, message = "O atributo tipo é obrigatório, deve conter no minimo 03 e no maximo 30 caracteres")	
	private String tipo;
	
	@NotNull
	@Size(min = 3 , max = 200,  message = "O atributo nomeOrganizacao é obrigatório, deve conter no minimo 03 e no maximo 200 caracteres")	
	private String nomeOrganizacao;
	
	@NotNull
	@Size(min = 3 , max = 50, message = "O atributo estudante é obrigatório, deve conter no minimo 03 e no maximo 50 caracteres")	
	private String estudante;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNomeOrganizacao() {
		return nomeOrganizacao;
	}

	public void setNomeOrganizacao(String nomeOrganizacao) {
		this.nomeOrganizacao = nomeOrganizacao;
	}

	public String getEstudante() {
		return estudante;
	}

	public void setEstudante(String estudante) {
		this.estudante = estudante;
	}
}
