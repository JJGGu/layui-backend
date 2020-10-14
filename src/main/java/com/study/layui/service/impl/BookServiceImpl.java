package com.study.layui.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.study.layui.mapper.BookMapper;
import com.study.layui.pojo.Book;
import com.study.layui.pojo.DataVo;
import com.study.layui.service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: layui
 * @description:
 * @author: JJGGu
 * @create: 2020-10-14 21:09
 **/
@Service
public class BookServiceImpl extends ServiceImpl<BookMapper, Book> implements BookService {

    @Autowired
    private BookMapper bookMapper;

    @Override
    public DataVo<Book> list(Integer page, Integer pageSize) {

        List<Book> books = bookMapper.selectList(null);
        return new DataVo<Book>(books);
    }
}
