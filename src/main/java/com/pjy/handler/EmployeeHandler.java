package com.pjy.handler;

import com.pjy.beans.Department;
import com.pjy.beans.Employee;
import com.pjy.service.DepartmentService;
import com.pjy.service.EmployeeServices;
import org.apache.ibatis.annotations.Param;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: Employee的controller
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 19:07
 */
@Controller
public class EmployeeHandler {

    @Autowired
    private EmployeeServices employeeServices;

    @Autowired
    private DepartmentService departmentService;

    /**
     * 显示所有的员工信息
     */
    @RequestMapping(value = "/employee",method = RequestMethod.GET)
    public String listAllEmps(Map<String,Object> map){
        List<Employee> allEmps = employeeServices.getAllEmps();
        map.put("emps",allEmps);
        return "list";
    }

    /**
     * 去往添加页面
     */
    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String toAddPage(Map<String,Object> map){
        List<Department> allDepts = departmentService.getAllDepts();
        map.put("depts",allDepts);
        HashMap<Object, Object> genders = new HashMap<>();
        genders.put("0","女");
        genders.put("1","男");

        map.put("genders",genders);

        map.put("employee",new Employee());
        return "add";
    }

    /**
     * 具体的添加操作
     */
    @RequestMapping(value = "/addEmp",method = RequestMethod.POST)
    public String insertEmp(Employee employee){
        employeeServices.insertEmp(employee);

        return "redirect:/employee";
    }

    /**
     * 删除员工信息
     */
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public String deleteEmp(@Param("id") Integer id){
        employeeServices.deleteEmp(id);

        return "redirect:/employee";
    }

}
