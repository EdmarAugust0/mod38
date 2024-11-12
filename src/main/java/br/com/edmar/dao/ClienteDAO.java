/**
 * 
 */
package br.com.edmar.dao;

import br.com.edmar.dao.generic.GenericDAO;
import br.com.edmar.domain.Cliente;

/**
 * @author rodrigo.pires
 *
 */
public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}