/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Departamento;


public interface DepartamentoRepository extends JpaRepository<Departamento,Long> {

}