
package br.com.luana.dao.jpa;

import br.com.luana.dao.generic.jpa.GenericJpaDAO;
import br.com.luana.domain.jpa.ProdutoJpa;


public class ProdutoJpaDAO extends GenericJpaDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}