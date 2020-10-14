package com.study.layui.controller;

import com.study.layui.pojo.Book;
import com.study.layui.pojo.DataVo;
import com.study.layui.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: layui
 * @description: 控制器
 * @author: JJGGu
 * @create: 2020-10-14 21:00
 **/
@Slf4j
@RestController
public class BookController {

    @Resource
    private BookService bookService;

    @GetMapping("/list")
    public DataVo<Book> listBooks(Integer page, Integer pageSize) {
        return bookService.list(page, pageSize);
    }
}
