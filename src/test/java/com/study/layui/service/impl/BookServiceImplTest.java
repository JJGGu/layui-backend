package com.study.layui.service.impl;

import com.study.layui.pojo.Book;
import com.study.layui.pojo.DataVo;
import com.study.layui.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {

    @Autowired
    private BookService bookService;

    @Test
    void test() {
        DataVo<Book> list = bookService.list(1, 2);
        List<Book> data = list.getData();
        data.forEach(System.out::println);
    }
}