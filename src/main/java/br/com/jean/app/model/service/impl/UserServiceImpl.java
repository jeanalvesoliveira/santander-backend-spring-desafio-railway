package br.com.jean.app.model.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jean.app.model.entity.User;
import br.com.jean.app.model.repository.UserRepository;
import br.com.jean.app.model.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	private final UserRepository userRepository;
	
	
	public UserServiceImpl(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if (userRepository.existByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("O id do usuário já existe");
		}
		return userRepository.save(user);
	}
	
	

}
