package br.com.telemetria.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.telemetria.DTO.UsuarioMinDTO;
import br.com.telemetria.servicos.UsuarioService;

@RestController
@RequestMapping(value= "/usuarios")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping
	public List<UsuarioMinDTO> findAll() {
		List<UsuarioMinDTO> result = usuarioService.findByAll();
		return result;
	}
}
