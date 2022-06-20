package com.codewithvish.blog.services;

import java.util.List;

import com.codewithvish.blog.payloads.UserDto;

public interface Userservice {

	UserDto createUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userID);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser(Integer userId);;
	
	
	
}
