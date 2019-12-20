package com.jk.controller;

import com.jk.domain.Student;
import com.jk.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    // 查询全部用户
    @RequestMapping("/findAll.do")
    public ModelAndView findAll(ModelAndView modelAndView){
        List<Student> studentList = studentService.findAll();
        modelAndView.addObject("studentList",studentList);
        modelAndView.setViewName("list");
        return modelAndView;
    }

    // 储存用户信息
    @RequestMapping("/save.do")
    public String save(Student student){
        studentService.save(student);
        return "redirect:findAll.do";
    }

    // 查询学生详情
    @RequestMapping("/findById.do")
    public ModelAndView findById(int id,ModelAndView modelAndView){
        Student studentInfo = studentService.findById(id);
        System.out.println(studentInfo);
        modelAndView.addObject("studentInfo",studentInfo);
        modelAndView.setViewName("student-show");
        return modelAndView;
    }
    // 删除学生信息
    @RequestMapping("/del.do")
    public String delStudent(int id){
        studentService.deleteStu(id);
        return "redirect:findAll.do";
    }

    // 修改前的查询操作
    @RequestMapping("/findWithUpdate.do")
    public ModelAndView findByIdForUp(int id,ModelAndView modelAndView){
        Student student = studentService.findById(id);
        modelAndView.addObject("student",student);
        modelAndView.setViewName("update");
        return modelAndView;
    }
    // 修改学生信息
    @RequestMapping("/update.do")
    public String updStudentById(Student student){
        studentService.updateStu(student);
        return "redirect:findAll.do";
    }
}
