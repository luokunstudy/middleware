package com.debug.middleware.server.entity;/**
 * Created by Administrator on 2019/3/13.
 */

import lombok.Data;
import lombok.ToString;

/**
 * 对象信息
 * @Author:debug (SteadyJack)
 * @Date: 2019/3/13 21:41
 **/
@Data
@ToString
public class User {
    private Integer id;
    private String userName;
    private String name;

    //空构造器与所有字段构造器
    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(Integer id, String userName, String name) {
        this.id = id;
        this.userName = userName;
        this.name = name;
    }
}





















