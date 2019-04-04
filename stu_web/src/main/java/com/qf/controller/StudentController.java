package com.qf.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
@Controller
@RequestMapping("/student")
public class StudentController {
    @Reference  //发现服务
    private IStuService stuService;

    @RequestMapping("/getStuList")
    public String getStudentList(ModelMap map){
        List<Student> studentList = stuService.getStudentList();
        map.put("studentList",studentList);
        System.out.println(studentList);
        return "StuList";
    }

    @RequestMapping("/addStu")
    public String addStudent(Student student){
        stuService.addStudent(student);
        return "/student/getStuList";
    }
}
