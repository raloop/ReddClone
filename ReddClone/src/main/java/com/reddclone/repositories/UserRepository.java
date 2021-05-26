package com.reddclone.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reddclone.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String username);

}
