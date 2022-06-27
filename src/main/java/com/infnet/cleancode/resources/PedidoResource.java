package com.infnet.cleancode.resources;

import com.infnet.cleancode.domain.Pedido;
import com.infnet.cleancode.services.PedidoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	private PedidoService service;

	public PedidoResource(PedidoService service) {
		this.service = service;
	}

	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> obtemPedidoPorID(@PathVariable Integer id) {
		Pedido obj = service.obtemPedidoPorID(id);
		return ResponseEntity.ok().body(obj);
	}
}
