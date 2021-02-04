package com.qing.service.impl;

import com.qing.dao.BooksDao;
import com.qing.domain.Books;
import com.qing.service.BooksService;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 16:03
 */
public class BooksServiceImpl implements BooksService {
    private BooksDao booksDao;

    public void setBooksDao(BooksDao booksDao) {
        this.booksDao = booksDao;
    }

    @Override
    public List<Books> queryAll() {
        return booksDao.queryAll();
    }
}
