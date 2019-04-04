package com.qf.service;

import com.qf.entity.Classes;

import java.util.List;

public interface IClassesService {

    public List<Classes> getClassesList();

    public int addClasses(Classes classes);
}
