package com.hl.dao;

import com.hl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserListById(int id);

    //分页
    List<User> getUserListByLimit(Map<String,Integer> map);

    //分页2
    List<User> getUserListByRowBands();
}
