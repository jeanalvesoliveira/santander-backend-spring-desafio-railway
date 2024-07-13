package br.com.jean.app.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jean.app.model.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	boolean existByAccountNumber(String accountNumber);

}
