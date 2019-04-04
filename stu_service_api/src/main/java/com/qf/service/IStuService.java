package com.qf.service;
import com.qf.entity.Student;
import java.util.List;
public interface IStuService {

    public List<Student> getStudentList();

    public int addStudent(Student student);
}
