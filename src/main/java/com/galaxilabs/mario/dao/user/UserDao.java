package com.galaxilabs.mario.dao.user;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.galaxilabs.mario.dao.Dao;
import com.galaxilabs.mario.entity.User;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}