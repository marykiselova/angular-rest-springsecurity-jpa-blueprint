package com.galaxilabs.mario.dao;

import java.util.List;

import com.galaxilabs.mario.entity.Entity;


public interface Dao<T extends Entity, I>
{

	List<T> findAll();


	T find(I id);


	T save(T newsEntry);


	void delete(I id);

}