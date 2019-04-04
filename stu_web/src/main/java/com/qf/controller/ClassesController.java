package com.qf.controller;
import com.alibaba.dubbo.config.annotation.Reference;
import com.qf.entity.Classes;
import com.qf.service.IClassesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/classes")
public class ClassesController {
    @Reference
    private IClassesService classesService;

    @RequestMapping("/classesList")
    public String getClassesList(ModelMap map){
        List<Classes> classesList = classesService.getClassesList();
        map.put("classList",classesList);
        System.out.println(classesList);
        return "classesList";
    }

    @RequestMapping("/addClasses")
    public String addClasses(Classes classes){
        classesService.addClasses(classes);
        return "/classes/classesList";
    }

}
