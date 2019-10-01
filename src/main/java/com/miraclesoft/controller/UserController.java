package com.miraclesoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.miraclesoft.entity.UserDetail;
import com.miraclesoft.service.UserService;

@RestController
@RequestMapping(value = "app")
public class UserController {

	@Autowired
    UserService userService;
	
	@RequestMapping(value = "user")
	public UserDetail getGreeting(@RequestParam(value = "name", defaultValue = "World") String name) {
		
		return new UserDetail();
	}
	
	 @RequestMapping(value = "adduser", method = RequestMethod.POST,
             consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
     @ResponseBody
     public UserDetail addNewUser(@RequestBody UserDetail user) {
         return this.userService.addUser(user);
     }
}