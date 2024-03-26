package br.com.mrs.restviaceppocendpoint.core.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.mrs.restviaceppocendpoint.core.port.out.dto.response.ViacepResponseDto;
import br.com.mrs.restviaceppocendpoint.infrastructure.rest.viacep.feign.ViacepFeign;

@Service
public class ViacepService {
	@Autowired
	private ViacepFeign viacepFeign;

	public ResponseEntity<ViacepResponseDto> find() {

		return viacepFeign.getAll();

	}
}
