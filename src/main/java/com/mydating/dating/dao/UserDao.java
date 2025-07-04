package com.mydating.dating.dao;
import com.mydating.dating.service.UserService;
import com.mydating.dating.util.UserGender;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mydating.dating.entity.User;
import com.mydating.dating.repository.UserRepository;

@Repository
public class UserDao {


	@Autowired
	UserRepository userRepository;

    

	public User saveUser(User user) {
		return userRepository.save(user);
	}



	public List<User> findAllMaleUsers() {
		return userRepository.findByGender(UserGender.MALE);
	}



	public List<User> findAllFemaleUsers() {
		return userRepository.findByGender(UserGender.FEMALE);
	}



	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}



	public Optional<User> findUserName(String name) {
		return userRepository.findByName(name);
	}



	public Optional<User> findUserEmail(String email) {
		return userRepository.findByEmail(email);
	}



	public Optional<User> findUserAge(int age) {
		return userRepository.findByAge(age);
	}



	public List<User> searchByName(String letters) {
		return userRepository.searchByName(letters);
	}



	public List<User> searchByEmail(String letters) {
		return userRepository.searchByEmail(letters);
	}
	
}
