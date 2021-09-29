package org.grupo7.conquerdaring.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotBlank
	@Size(max = 30)	
	private String tipo;
	
	@NotBlank
	@Size(max = 200)	
	private String nomeOrganizacao;
	
	@NotBlank
	@Size(max = 50)	
	
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
