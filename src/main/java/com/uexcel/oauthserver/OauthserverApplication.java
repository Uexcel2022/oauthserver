package com.uexcel.oauthserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

//import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@SpringBootApplication

public class OauthserverApplication {
	@Autowired

	public static void main(String[] args) {
		SpringApplication.run(OauthserverApplication.class, args);
	}

	 @Bean
	 InMemoryUserDetailsManager inMemoryUserDetailsManager() {
	 var user = User.withDefaultPasswordEncoder().username("uexcel").roles("USER")
	 .password("1234").build();
	 return new InMemoryUserDetailsManager(user);
	 }

}
