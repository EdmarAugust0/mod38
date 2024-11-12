/**
 * 
 */
package br.com.edmar.service;

import javax.ejb.Stateless;
import javax.inject.Inject;

import br.com.edmar.dao.IClienteDAO;
import br.com.edmar.domain.Cliente;
import br.com.edmar.exceptions.DAOException;
import br.com.edmar.exceptions.MaisDeUmRegistroException;
import br.com.edmar.exceptions.TableException;
import br.com.edmar.services.generic.GenericService;

/**
 * @author rodrigo.pires
 *
 */
@Stateless
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {
	
	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}