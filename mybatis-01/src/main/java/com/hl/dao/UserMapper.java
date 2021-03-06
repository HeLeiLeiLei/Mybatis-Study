package com.hl.dao;

import com.hl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    List<User> getUserListById(int id);
    int addUser(User user);
    int updateUser(User user);
    int deletUser(int id);
}
