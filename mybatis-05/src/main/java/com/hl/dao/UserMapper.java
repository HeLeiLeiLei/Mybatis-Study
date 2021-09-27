package com.hl.dao;

import com.hl.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from user")
    List<User> getUsers();

    @Select("select * from user where id=#{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,userName,userPassword) values(#{id},#{userName},#{userPassword})")
    int addUser(User user);

    @Update("update user set userName=#{userName},userPassword=#{userPassword} where id=#{id}")
    int updateUser(User user);

    @Delete("delete from user where id=#{id2}")
    int deleteUser(@Param("id2") int id);
}
