package com.qf.service.impl;
import com.alibaba.dubbo.config.annotation.Service;
import com.qf.dao.ClassesMapper;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
@Service
public class ClassesServiceImpl implements IClassesService {

    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public List<Classes> getClassesList() {
        return classesMapper.selectList(null);
    }

    @Override
    public int addClasses(Classes classes) {
        return classesMapper.insert(classes);
    }
}
