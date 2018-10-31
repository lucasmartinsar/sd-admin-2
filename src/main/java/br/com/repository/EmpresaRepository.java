/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Empresa;



public interface EmpresaRepository extends JpaRepository<Empresa,Long>{

}