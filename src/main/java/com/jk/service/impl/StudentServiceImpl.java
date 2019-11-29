package com.jk.service.impl;

import com.jk.dao.Istudentdao;
import com.jk.domain.Student;
import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private Istudentdao istudentdao;

    @Override
    public List<Student> findAll() {
        System.out.println("Service业务层：查询所有账户...");
        return istudentdao.findAll();
    }

    @Override
    public void save(Student student) {
        System.out.println("Service业务层：储存用户信息...");
        istudentdao.save(student);
    }

    @Override
    public Student findById(int s_id) {
        System.out.println("Service业务层：查询一个用户...");
        return istudentdao.findById(s_id);
    }

    @Override
    public void deleteStu(int s_id) {
        System.out.println("Service业务层：删除用户");
        istudentdao.deleteStu(s_id);
    }

    @Override
    public void updateStu(Student student) {
        System.out.println("Service业务层：修改用户信息");
        istudentdao.updeteStu(student);
    }
}
