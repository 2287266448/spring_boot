package com.example.billing.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.billing.entity.User;

@Mapper
public interface UserMapper {
	
	@Select(value="select * from user")
	List<User> all();
}
