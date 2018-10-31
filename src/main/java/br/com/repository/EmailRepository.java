/**
 * 
 */
package br.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Email;


public interface EmailRepository extends JpaRepository<Email, Long>{

}
