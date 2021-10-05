package org.grupo7.conquerdaring.repository;

import java.util.List;

import org.grupo7.conquerdaring.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	public List<Produto> findAllByCursoContainingIgnoreCase (String curso);
}