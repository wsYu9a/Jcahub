package com.jcahub.dao;

import com.jcahub.entity.Dept;

import java.util.List;

public interface JdbcDao {
    public List<Dept> finAllDeptByLike(String name);

    public List<Dept> finAllDept(String name,String sname);




}
