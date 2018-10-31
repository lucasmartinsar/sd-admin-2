/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco,Long> {
	
}