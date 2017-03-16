package com.xxt.utils;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtils {
	/**
	 * 1.初始化C3P0连接池
	 */
	private static DataSource dataSource;
	static {
		dataSource=new ComboPooledDataSource();
	}
	/**
	 * 2.创建DbUtil核心工具类对象
	 */
	public static QueryRunner getQueryRunner(){
		//创建QueryRunner对象，传入连接池对象
		//在创建QueryRunner对象的时候，如果传入了数据源对象，
		//那么在使用QueryRunner对象方法的时候就不需要传入连接对象
		//会自动从数据源中获取链接
		QueryRunner qr=new QueryRunner(dataSource);
		return qr;
	}
	public static DataSource getDataSource(){
		return dataSource;
		
	}
}
