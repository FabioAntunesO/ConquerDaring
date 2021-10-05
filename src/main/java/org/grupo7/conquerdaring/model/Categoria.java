package org.grupo7.conquerdaring.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_categoria;
	
	@NotNull
	@Size(min = 2 , max = 30, message = "O atributo tipo é obrigatório, deve conter no minimo 03 e no maximo 30 caracteres")	
	private String tipo;
	
	@NotNull
	@Size(min = 2 , max = 200,  message = "O atributo nomeOrganizacao é obrigatório, deve conter no minimo 03 e no maximo 200 caracteres")	
	private String nomeOrganizacao;

	@Temporal(TemporalType.TIMESTAMP)
    private Date data = new java.sql.Date(System.currentTimeMillis());
	
<<<<<<< HEAD
	@Temporal(TemporalType.TIMESTAMP)
	private Date date = new java.sql.Date(System.currentTimeMillis());
=======
>>>>>>> 852abc98d166a539d611bc5c7480c0e4e62c75fd
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produto;

	public long getId() {
		return id_categoria;
	}

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public void setId(long id) {
		this.id_categoria = id;
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

<<<<<<< HEAD
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
=======
	public long getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(long id_categoria) {
		this.id_categoria = id_categoria;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
>>>>>>> 852abc98d166a539d611bc5c7480c0e4e62c75fd
	}
	
}

