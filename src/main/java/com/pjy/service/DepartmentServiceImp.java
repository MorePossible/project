package com.pjy.service;

import com.pjy.beans.Department;
import com.pjy.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description:
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-24 11:13
 */
@Service
public class DepartmentServiceImp implements DepartmentService {

    @Autowired
    private DepartmentMapper departmentMapper;

    @Override
    public List<Department> getAllDepts() {
        return departmentMapper.getDepts();
    }
}
