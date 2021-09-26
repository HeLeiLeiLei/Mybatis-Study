package com.hl.dao;

import com.hl.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    //模糊查询
    List<User> getUserListLike(Map<String, Object> map);
    List<User> getUserListById(int id);
    List<User> getUserListById2(Map<String, Object> map);
    int addUser(User user);
    int updateUser(User user);
    int deletUser(int id);
}
