package com.qing.dao;

import com.qing.domain.Books;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 9:56
 */
public interface BooksDao {
    /**
     * 查询全部书籍
     * @return
     */
    List<Books> queryAll();
}
