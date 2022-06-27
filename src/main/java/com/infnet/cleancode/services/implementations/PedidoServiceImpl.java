package com.infnet.cleancode.services.implementations;

import com.infnet.cleancode.domain.Pedido;
import com.infnet.cleancode.repositories.PedidoRepository;
import com.infnet.cleancode.services.PedidoService;
import com.infnet.cleancode.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PedidoServiceImpl implements PedidoService {
	private final PedidoRepository pedidoRepository;

	public PedidoServiceImpl(PedidoRepository repo) {
		this.pedidoRepository = repo;
	}

	public Pedido obtemPedidoPorID(Integer id) {
		Optional<Pedido> pedido = pedidoRepository.findById(id);
		return pedido.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
}
