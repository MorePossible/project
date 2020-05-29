package com.pjy.mapper;

import com.pjy.beans.Department;

import java.util.List;

/**
 * @Description:  部门的方法接口
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 11:15
 */
public interface DepartmentMapper {

    //获取所有的部门信息
    public List<Department> getDepts();

}
