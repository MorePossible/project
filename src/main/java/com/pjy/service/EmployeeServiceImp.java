package com.pjy.service;

import com.pjy.beans.Employee;
import com.pjy.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 19:09
 */
@Service
public class EmployeeServiceImp implements EmployeeServices {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmps() {
        return employeeMapper.getEmps();
    }

    @Override
    public void insertEmp(Employee employee) {
        employeeMapper.insertEmp(employee);
    }

    @Override
    public void deleteEmp(Integer id) {
        employeeMapper.deleteEmp(id);
    }
}
