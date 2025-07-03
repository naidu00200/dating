package com.mydating.dating.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mydating.dating.entity.User;
import com.mydating.dating.util.UserGender;

public interface UserRepository extends JpaRepository<User, Integer> {

	List<User> findByGender(UserGender male);

	Optional<User> findByName(String name);

	Optional<User> findByEmail(String email);

	Optional<User> findByAge(int age);


}
