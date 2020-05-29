package com.pjy.mapper;

import com.pjy.beans.Employee;

import java.util.List;

/**
 * @Description:  员工的方法接口
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 11:13
 */
public interface EmployeeMapper {

    //获取所有员工信息
    public List<Employee> getEmps();

    //添加员工信息
    public void insertEmp(Employee emp);

    //删除员工
    public void deleteEmp(Integer id);

}
