package com.infnet.cleancode.services.implementations;

import com.infnet.cleancode.domain.Categoria;
import com.infnet.cleancode.repositories.CategoriaRepository;
import com.infnet.cleancode.services.CategoriaService;
import com.infnet.cleancode.services.exceptions.ObjectNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	private CategoriaRepository categoriaRepository;

	public CategoriaServiceImpl(CategoriaRepository categoriaRepository) {
		this.categoriaRepository = categoriaRepository;
	}

	public Categoria buscarCategoriaDeProdutoViaID(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
