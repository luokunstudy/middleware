package com.debug.middleware.server.entity;

import lombok.Data;

/**
 * @author luokun
 * @date 2021/04/19 19:46
 */
@Data
public class Book {
    private Integer bookNo;

    private String name;

    public Integer getBookNo() {
        return bookNo;
    }

    public void setBookNo(Integer bookNo) {
        this.bookNo = bookNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
