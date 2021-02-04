package com.qing.service;

import com.qing.domain.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 卿
 * @create 2020-12-23 9:57
 */
@Service
public interface BooksService {
    /**
     * 查询全部书籍
     * @return
     */
    List<Books> queryAll();
}
