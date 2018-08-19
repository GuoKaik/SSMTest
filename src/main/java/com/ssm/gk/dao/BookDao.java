package com.ssm.gk.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.gk.domain.Book;

public interface BookDao {
	/**
	 * 通过ID查询单本图书
	 * 
	 * @param id
	 * @return
	 */
	Book queryById(long id);
	/**
	 * 查询所有图书
	 * 
	 * @param offset 查询起始位置
	 * @param limit 查询条数
	 * @return
	 */
	//List<Book> queryAll(@Param("offset") int offset, @Param("limit") int limit);
}
