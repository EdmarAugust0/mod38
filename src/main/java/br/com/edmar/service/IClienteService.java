/**
 * 
 */
package br.com.edmar.service;

import br.com.edmar.domain.Cliente;
import br.com.edmar.exceptions.DAOException;
import br.com.edmar.services.generic.IGenericService;

/**
 * @author rodrigo.pires
 *
 */
public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

}