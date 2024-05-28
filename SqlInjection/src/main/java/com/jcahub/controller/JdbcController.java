package com.jcahub.controller;

import com.jcahub.entity.Dept;
import lombok.extern.slf4j.Slf4j;
import com.jcahub.service.impl.JdbcServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/jdbc")
public class JdbcController {

    @Autowired
    private JdbcServiceImpl jdbcService;


    @RequestMapping("/like")
    public List<Dept> like(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            name="";
        }
        log.info(name);
        return jdbcService.getAllDeptByLike(name);
    }

    @RequestMapping("/orderBy")
    public List<Dept> orderBy(@RequestParam(value = "name", required = false) String name,
                              @RequestParam(value = "sname", required = false) String sname){
        if (name == null) {
            name="";
        }
        if (sname == null) {
            sname="id";
        }
        log.info(name);
        return jdbcService.getAllDept(name,sname);
    }


}
