package com.infnet.cleancode.resources;


import com.infnet.cleancode.domain.Categoria;
import com.infnet.cleancode.services.implementations.CategoriaServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	private final CategoriaServiceImpl service;
	public CategoriaResource(CategoriaServiceImpl service) {
		this.service = service;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> buscarCategoriaDeProdutoViaID(@PathVariable Integer id) {
		Categoria categoria = service.buscarCategoriaDeProdutoViaID(id);
		return ResponseEntity.ok().body(categoria);
	}
}
