package Crud.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import Crud.model.User;
import Crud.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}