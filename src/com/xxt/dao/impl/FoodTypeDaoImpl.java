package com.xxt.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.xxt.dao.FoodTypeDao;
import com.xxt.entity.FoodType;
import com.xxt.utils.JdbcUtils;

public class FoodTypeDaoImpl implements FoodTypeDao{

	@Override
	public void save(FoodType foodtype) {
		String sql="INSERT INTO foodType(typeName) VALUES(?)"; 
		try {
			JdbcUtils.getQueryRunner().update(sql,foodtype.getTypeName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void update(FoodType foodtype) {
		String sql="update foodType set typeName=? where id=?"; 
		try {
			JdbcUtils.getQueryRunner().update(sql,foodtype.getTypeName(),foodtype.getId());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void delete(int id) {
		String sql="delete from foodType where id=?"; 
		try {
			JdbcUtils.getQueryRunner().update(sql,id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public List<FoodType> getAll() {
		String sql="select * from foodType "; 
		List<FoodType> list=null;
		try {
			list=JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<FoodType>(FoodType.class));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public List<FoodType> getAll(String typeName) {
		String sql="select * from foodType where typeName like ?"; 
		List<FoodType> list=null;
		try {
			list=JdbcUtils.getQueryRunner().query(sql, new BeanListHandler<FoodType>(FoodType.class),"%"+typeName+"%");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public FoodType findById(int id) {
		String sql="select * from foodType where id=?";
		FoodType type=null;
		try {
			type=JdbcUtils.getQueryRunner().query(sql, new BeanHandler<FoodType>(FoodType.class),id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return type;
	}

}
