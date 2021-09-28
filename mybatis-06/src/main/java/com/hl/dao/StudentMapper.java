package com.hl.dao;

import com.hl.pojo.Student;

import java.util.List;

public interface StudentMapper {
    //获取所有学生信息
    List<Student> getstudents();

    List<Student> getStudentById(int id);


}
