package com.study.layui.mapper;

import com.study.layui.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class BookMapperTest {

    @Resource
    private BookMapper bookMapper;

    @Test
    void test(){
        bookMapper.selectList(null).forEach(System.out::println);
    }
}