package com.hl.pojo;

import lombok.Data;

import java.util.List;

@Data
public class Teacher {
    private int id;
    private String teacherName;
    private List<Student> students;
}
