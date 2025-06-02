package br.com.telemetria.projections;

import br.com.telemetria.ENUM.TipoAcesso;
import br.com.telemetria.ENUM.TipoStatus;

public interface UsuarioMinProjection {
	Long getId();
	String getNome();
	String getEmail();
	TipoAcesso getTipo();
	TipoStatus getStatus();
}
