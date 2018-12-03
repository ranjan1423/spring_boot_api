package com.store.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/auth")
public class Authenticate {

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public Object test() {

		return "hello";
	}
	
	@RequestMapping(path = "/int", method = RequestMethod.GET)
	public Integer integer() {

		return new Integer(10);
	}

	@RequestMapping(path = "/validateuser", method = RequestMethod.GET, params = { "userName", "password" })
	public Object login(@RequestParam("userName") String userName, @RequestParam("password") String password) {

		return "hello - " + userName + "@" + password;
	}
}
