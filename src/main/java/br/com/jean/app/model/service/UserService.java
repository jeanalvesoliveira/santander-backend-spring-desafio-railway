package br.com.jean.app.model.service;

import br.com.jean.app.model.entity.User;

public interface UserService {

	User findById(Long id);
	
	User create(User user);
	
		
}
