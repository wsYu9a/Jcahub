package com.jcahub.service;

import com.jcahub.entity.Dept;

import java.util.List;

public interface MybatisService {
    public List<Dept> getAllDeptByLike(String name);

    public List<Dept> getAllDept(String name,String sname);
}
