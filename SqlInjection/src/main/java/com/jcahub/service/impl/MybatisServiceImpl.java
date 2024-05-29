package com.jcahub.service.impl;

import com.jcahub.entity.Dept;
import com.jcahub.mapper.DeptMapper;
import com.jcahub.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisServiceImpl implements MybatisService {

    @Autowired
    private DeptMapper deptMapper;

    @Override
    public List<Dept> getAllDeptByLike(String name) {
        return deptMapper.finAllDeptByLike(name);
    }

    @Override
    public List<Dept> getAllDept(String name, String sname) {
        System.out.println(deptMapper.finAllDept(name,sname));

        return deptMapper.finAllDept(name,sname);
    }
}
