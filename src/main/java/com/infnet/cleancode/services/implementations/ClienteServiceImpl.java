package com.infnet.cleancode.services.implementations;

import com.infnet.cleancode.domain.Cliente;
import com.infnet.cleancode.repositories.ClienteRepository;
import com.infnet.cleancode.services.ClienteService;
import com.infnet.cleancode.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {
	private ClienteRepository clienteRepository;

	public ClienteServiceImpl(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente buscarClientePorID(Integer id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName()));
	}
}
