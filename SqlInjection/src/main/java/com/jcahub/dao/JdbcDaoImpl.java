package com.jcahub.dao;

import com.jcahub.entity.Dept;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class JdbcDaoImpl extends BaseDao implements JdbcDao{
    @Override
    public List<Dept> finAllDeptByLike(String name) {
        List<Dept> list =null;
        try {
            String sql = "select * from dept where name like '%" + name + "%'";

            log.info(sql);
            Object[] params=null;
            //调用方法
            rs=this.executQuery(sql, params);
            if(null!=rs) {
                list = new ArrayList<>();
                while(rs.next()) {
                    Dept dept = new Dept();
                    dept.setId(rs.getInt("id")); // 获取整数类型的ID
                    dept.setName(rs.getString("name")); // 获取部门名称
                    dept.setCreateTime(rs.getTimestamp("create_time").toLocalDateTime()); // 将时间戳转换为 LocalDateTime
                    dept.setUpdateTime(rs.getTimestamp("update_time").toLocalDateTime());
                    list.add(dept);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            this.closeAll(conn, pstmt, rs);
        }
        return list;
    }

    @Override
    public List<Dept> finAllDept(String name, String sname) {
        List<Dept> list =null;
        try {
            String sql = "select * from dept where name like ? order by " + sname + " ASC";

            log.info(sql);
            Object[] params= {"%"+name+"%"};
            //调用方法
            rs=this.executQuery(sql, params);
            if(null!=rs) {
                list = new ArrayList<>();
                while(rs.next()) {
                    Dept dept = new Dept();
                    dept.setId(rs.getInt("id")); // 获取整数类型的ID
                    dept.setName(rs.getString("name")); // 获取部门名称
                    dept.setCreateTime(rs.getTimestamp("create_time").toLocalDateTime()); // 将时间戳转换为 LocalDateTime
                    dept.setUpdateTime(rs.getTimestamp("update_time").toLocalDateTime());
                    list.add(dept);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            this.closeAll(conn, pstmt, rs);
        }
        return list;
    }
}
