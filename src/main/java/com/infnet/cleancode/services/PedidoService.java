package com.infnet.cleancode.services;

import com.infnet.cleancode.domain.Pedido;
import com.infnet.cleancode.repositories.PedidoRepository;
import com.infnet.cleancode.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

public interface PedidoService {

	public Pedido obtemPedidoPorID(Integer id);
}
