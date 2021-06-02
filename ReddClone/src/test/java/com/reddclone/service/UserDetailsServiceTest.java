package com.reddclone.service;

import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

class UserDetailsServiceTest {

	@SuppressWarnings("deprecation")
	@Test
	void generate_encrypted_password() {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String rawPassword = "asdfasdf";
		String encodedPassword = encoder.encode(rawPassword);
		
		System.out.println(encodedPassword);
		
		assertThat(rawPassword, not(encodedPassword));
	}

}
