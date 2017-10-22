package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import DTO.UserDto;
import Service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends AbstractResourceController{
	
	@Autowired
	private UserService service;
	
	@GetMapping("/getUser/{id}")
	public UserDto findUser(@PathVariable String id) {
		return service.findUser(id);	
	}
	
	@GetMapping("/getUser")
	public String findUser() {
		return "hola";	
	}
	
}
