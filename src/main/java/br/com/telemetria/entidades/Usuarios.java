package br.com.telemetria.entidades;

import java.io.Serializable;
import java.util.Objects;

import br.com.telemetria.ENUM.TipoAcesso;
import br.com.telemetria.ENUM.TipoStatus;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name="tb_usuarios")
public class Usuarios implements Serializable {
	
	private static final long serialVersionUID = 1L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	private Long id;
	
	 
	private String nome;
	
 
	private String email;
	
 
	private String senha;
	
	@Enumerated(value= EnumType.STRING)
	private TipoAcesso tipo;
	
	@Enumerated(value= EnumType.STRING)
	private TipoStatus status;
	
	/* Uma abordagem comum para relacionar Usuário e Empresa é um relacionamento OneToMany, 
	  onde uma empresa tem muitos usuários. 
	*/
	
	@ManyToOne
	@JoinColumn(name="empresa_id")
	private Empresa empresa;
	

	public Usuarios() {
	}

	public Usuarios(Long id, String nome, String email, String senha, TipoAcesso tipo, TipoStatus status) {
		this.id    = id;
		this.nome  = nome;
		this.email = email;
		this.senha = senha;
		this.tipo = tipo;
		this.status = status;
	}

	public Usuarios(Usuarios entity) {

		id = entity.getId();
		nome = entity.getNome();
		email = entity.getEmail();
		senha = entity.getSenha();
		tipo = entity.getTipo();
		status = entity.getStatus();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	

	public TipoAcesso getTipo() {
		return tipo;
	}

	public void setTipo(TipoAcesso tipo) {
		this.tipo = tipo;
	}

	public TipoStatus getStatus() {
		return status;
	}

	public void setStatus(TipoStatus status) {
		this.status = status;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuarios other = (Usuarios) obj;
		return Objects.equals(id, other.id);
	}

	 

}
