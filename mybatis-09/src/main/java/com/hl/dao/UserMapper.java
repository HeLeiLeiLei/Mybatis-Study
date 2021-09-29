package com.hl.dao;

import com.hl.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    //根据ID查询用户
    User findUserById(@Param("id") int id);

    //修改用户
    int updateUser(User user);
}
