package com.hl.dao;

import com.hl.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserListById(int id);
}
