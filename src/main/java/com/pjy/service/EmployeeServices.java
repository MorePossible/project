package com.pjy.service;

import com.pjy.beans.Employee;

import java.util.List;

/**
 * @Description:
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 19:09
 */

public interface EmployeeServices {

    public List<Employee> getAllEmps();

    public void insertEmp(Employee employee);

    public void deleteEmp(Integer id);

}
