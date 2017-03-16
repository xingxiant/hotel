package com.xxt.entity;
/**
 * 菜系实体
 * 
	CREATE TABLE foodType(
	id INT PRIMARY KEY AUTO_INCREMENT,
	typeName VARCHAR(20)          -- 类别名称
	
	)
 * @author 13983
 *
 */
public class FoodType {
	private int id;
	private String typeName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
}
