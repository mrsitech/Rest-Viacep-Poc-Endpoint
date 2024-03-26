package br.com.mrs.restviaceppocendpoint.api.rest.viacep;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mrs.restviaceppocendpoint.core.application.service.ViacepService;
import br.com.mrs.restviaceppocendpoint.core.port.out.dto.response.ViacepResponseDto;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ViacepControllerImpl {

	private final ViacepService viacepservice;

	@GetMapping
	public ResponseEntity<ViacepResponseDto> getViacep() {

		ResponseEntity<ViacepResponseDto> viacepResponseDtos = viacepservice.find();

		return viacepResponseDtos;
	}

}
