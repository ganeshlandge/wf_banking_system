package com.example.demo.controller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@RestController
@RequestMapping
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);	
	}
	
//	@GetMapping("/user/{id}")
//	public User getUser(@PathVariable Long id){
//		return userRepository.findById(id);
//	}
}
