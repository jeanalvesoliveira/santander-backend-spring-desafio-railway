package br.com.jean.app.model.service.impl;

import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.jean.app.model.entity.User;
import br.com.jean.app.model.repository.UserRepository;
import br.com.jean.app.model.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public User findById(Long id) {
		return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
	}

	@Override
	public User create(User user) {
		if (userRepository.existsByAccountNumber(user.getAccount().getNumber())) {
			throw new IllegalArgumentException("Este número de conta já existe");
		}
		return userRepository.save(user);
	}

}
