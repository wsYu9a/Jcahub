package com.jcahub.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import com.jcahub.entity.Dept;

import java.util.List;

@Mapper
public interface DeptMapper {
    @Select("select * from dept where name like '%${name}%'")
    public List<Dept> finAllDeptByLike(String name);

    public List<Dept> finAllDept(String name,String sname);
}
