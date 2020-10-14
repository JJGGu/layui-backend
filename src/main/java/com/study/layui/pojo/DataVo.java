package com.study.layui.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @program: layui
 * @description:
 * @author: JJGGu
 * @create: 2020-10-14 21:07
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataVo<T> {
    private Integer code = 0;
    private String msg = "";
    private Integer count = 3000;
    private List<T> data;

    public DataVo(List<T> data) {
        this.data = data;
    }
}
