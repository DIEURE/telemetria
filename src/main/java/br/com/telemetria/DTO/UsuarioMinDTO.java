package br.com.telemetria.DTO;

import br.com.telemetria.ENUM.TipoAcesso;
import br.com.telemetria.ENUM.TipoStatus;
import br.com.telemetria.entidades.Empresa;
import br.com.telemetria.entidades.Usuarios;
import br.com.telemetria.projections.UsuarioMinProjection;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class UsuarioMinDTO {

	private Long id;
	
	 
	private String nome;
	
 
	private String email;
	
 
 
	
	@Enumerated(value= EnumType.STRING)
	private TipoAcesso tipo;
	
	@Enumerated(value= EnumType.STRING)
	private TipoStatus status;
 
	private Empresa empresa;

	public UsuarioMinDTO(Usuarios entity) {
		id     = entity.getId();
		nome   = entity.getNome();
		email  = entity.getEmail();
		tipo   = entity.getTipo();
		status = entity.getStatus();		
	}
	
	public UsuarioMinDTO(UsuarioMinProjection projection) {
		id     = projection.getId();
		nome   = projection.getNome();
		email  = projection.getEmail();
		tipo   = projection.getTipo();
		status = projection.getStatus();		
	}
	
	

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}
 

	public TipoAcesso getTipo() {
		return tipo;
	}

	public TipoStatus getStatus() {
		return status;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

 
	
	
}
