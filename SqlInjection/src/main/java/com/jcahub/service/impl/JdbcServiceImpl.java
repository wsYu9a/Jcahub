package com.jcahub.service.impl;

import com.jcahub.entity.Dept;
import com.jcahub.dao.JdbcDao;
import com.jcahub.dao.JdbcDaoImpl;

import java.util.List;

import com.jcahub.service.JdbcService;
import org.springframework.stereotype.Service;

@Service
public class JdbcServiceImpl implements JdbcService {

    JdbcDao jdbcDao =new JdbcDaoImpl();
    @Override
    public List<Dept> getAllDeptByLike(String name) {
        return jdbcDao.finAllDeptByLike(name);
    }

    @Override
    public List<Dept> getAllDept(String name,String sname) {
        return jdbcDao.finAllDept(name,sname);
    }
}
