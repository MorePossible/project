package com.pjy.beans;

/**
 * @Description:
 * @Author: pjy   Email-15571089876@163.com
 * @CreateTime: 2020-05-22 11:12
 */
public class Department {
    private Integer id;
    private String deptName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Department(Integer id, String deptName) {
        this.id = id;
        this.deptName = deptName;
    }

    public Department() {
    }
}
