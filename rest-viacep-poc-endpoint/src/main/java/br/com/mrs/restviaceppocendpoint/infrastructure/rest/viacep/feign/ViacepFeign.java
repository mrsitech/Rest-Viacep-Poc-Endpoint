package br.com.mrs.restviaceppocendpoint.infrastructure.rest.viacep.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.mrs.restviaceppocendpoint.core.port.out.dto.response.ViacepResponseDto;


@FeignClient(name = "resource", url = "http://viacep.com.br/ws/80050350/json")
public interface ViacepFeign {

	@GetMapping(produces = "application/json", consumes = "application/json"
			)
	public ResponseEntity <ViacepResponseDto> getAll();

	

}
