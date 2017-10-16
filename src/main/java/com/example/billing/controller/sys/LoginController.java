package com.example.billing.controller.sys;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@EnableAutoConfiguration
public class LoginController {

	@GetMapping("/sys_admin/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/sys_admin/logout")
	public String logout() {
		return "logout";
	}
}
