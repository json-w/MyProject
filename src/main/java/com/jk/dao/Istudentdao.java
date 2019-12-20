package com.jk.dao;

import com.jk.domain.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Istudentdao {

    @Select("select * from student")
    public List<Student> findAll();

    @Insert("insert into student(name,age,sex,number,address) values (#{name},#{age},#{sex},#{number},#{address})")
    public void save(Student student);

    @Select("select * from student where sid=#{id}")
    Student findById(int id);

    @Delete("delete from student where sid=#{id}")
    void deleteStu(int id);

    @Update("update student set name=#{name},age=#{age},sex=#{sex},number=#{number},address=#{address} where sid=#{sid}")
    int updeteStu(Student student);
}
