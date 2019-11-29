package com.jk.service;

import com.jk.domain.Student;

import java.util.List;

public interface StudentService {
    // 查询全部用户
    public List<Student> findAll();

    // 储存用户信息
    void save(Student student);

    // 根据id查询用户
    Student findById(int s_id);

    // 根据id删除用户
    void deleteStu(int s_id);

    // 修改用户信息
    void updateStu(Student student);
}
