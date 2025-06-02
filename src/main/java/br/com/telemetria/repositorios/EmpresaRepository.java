package br.com.telemetria.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.telemetria.entidades.Usuarios;

@Repository
public interface EmpresaRepository extends JpaRepository<Usuarios, Long> {

}
