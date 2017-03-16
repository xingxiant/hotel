package com.xxt.dao.impl;

import java.util.List;

import com.xxt.dao.FoodTypeDao;
import com.xxt.entity.FoodType;

public class FoodTypeDaoImpl implements FoodTypeDao{

	@Override
	public void save(FoodType foodtype) {
		String sql="INSERT INTO foodType(typeName) VALUES(?)"; 
		
	}

	@Override
	public void update(FoodType foodtype) {
		String sql=""; 

		
	}

	@Override
	public void delete(int id) {
		String sql=""; 

		
	}

	@Override
	public List<FoodType> getAll() {
		String sql=""; 

		return null;
	}

	@Override
	public List<FoodType> getAll(String typeName) {
		String sql=""; 

		return null;
	}

	@Override
	public FoodType findById(int id) {
		String sql=""; 

		return null;
	}

}
