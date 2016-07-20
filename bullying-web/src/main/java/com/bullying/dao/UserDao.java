package com.bullying.dao;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.bullying.entity.User;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}