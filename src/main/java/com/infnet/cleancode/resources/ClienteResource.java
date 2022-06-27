package com.infnet.cleancode.resources;

import com.infnet.cleancode.domain.Cliente;
import com.infnet.cleancode.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	private ClienteService service;

	public ClienteResource(ClienteService service) {
		this.service = service;
	}

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarClientePorID(@PathVariable Integer id) {
		Cliente cliente = service.buscarClientePorID(id);
		return ResponseEntity.ok().body(cliente);
	}
}
