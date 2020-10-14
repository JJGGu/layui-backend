package com.study.layui.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.study.layui.pojo.Book;
import com.study.layui.pojo.DataVo;

import java.util.List;

public interface BookService extends IService<Book> {
    DataVo<Book> list(Integer page, Integer pageSize);
}
