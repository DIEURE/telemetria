package br.com.telemetria.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.telemetria.DTO.UsuarioMinDTO;
import br.com.telemetria.entidades.Usuarios;
import br.com.telemetria.repositorios.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Transactional
	public List<UsuarioMinDTO> findByAll(){
		List<Usuarios> result = usuarioRepository.findAll();
		return result.stream().map(UsuarioMinDTO::new).toList();
		
	}

}
