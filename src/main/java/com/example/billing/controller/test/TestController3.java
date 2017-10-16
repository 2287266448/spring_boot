package com.example.billing.controller.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.billing.dao.UserMapper;


@RequestMapping("test")
@RestController
@Configuration
@EnableAutoConfiguration
public class TestController3 {
	@Autowired
	private UserMapper userMapper;
	
	@GetMapping("/list/all")
	public Object listAll() {
		return userMapper.all();
	}

}