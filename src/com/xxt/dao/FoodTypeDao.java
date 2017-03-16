package com.xxt.dao;

import java.util.List;

import com.xxt.entity.FoodType;

public interface FoodTypeDao {
	/*
	 * 添加
	 */
	void save(FoodType foodtype);
	/*
	 * 更新
	 */
	void update(FoodType foodtype);
	/*
	 * 删除
	 */
	void delete(int id);
	/*
	 * 查询全部
	 */
	List<FoodType> getAll();
	/*
	 * 根据名称搜索
	 */
	List<FoodType> getAll(String typeName);
	/*
	 * 根据主键查询
	 */
	FoodType findById(int id);
	
	
}
