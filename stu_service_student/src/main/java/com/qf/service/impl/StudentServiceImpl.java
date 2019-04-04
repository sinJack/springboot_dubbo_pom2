package com.qf.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.StudentMapper;
import com.qf.entity.Student;
import com.qf.service.IStuService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class StudentServiceImpl implements IStuService {

    @Autowired
    private StudentMapper studentMapper;
    @Override
    public List<Student> getStudentList() {
        return studentMapper.selectList(null);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.insert(student);
    }
}
