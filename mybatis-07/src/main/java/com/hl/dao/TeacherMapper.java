package com.hl.dao;

import com.hl.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取所有老师
    List<Teacher> getTeacher();

    //获去指定老师的所有学生
    Teacher getTeacherstudents(@Param("id") int id);
}
