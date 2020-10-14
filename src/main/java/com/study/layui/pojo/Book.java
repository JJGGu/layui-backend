package com.study.layui.pojo;

import lombok.Data;

/**
 * @program: layui
 * @description: 书籍实体类
 * @author: JJGGu
 * @create: 2020-10-14 20:33
 **/

@Data
public class Book {
    private Integer id;
    private String name;
    private String author;
    private String kind;
    private Integer count;
    private String logo;
}
