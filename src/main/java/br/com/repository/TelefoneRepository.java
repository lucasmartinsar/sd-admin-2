/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Telefone;

 
public interface TelefoneRepository extends JpaRepository<Telefone,Long>{

}