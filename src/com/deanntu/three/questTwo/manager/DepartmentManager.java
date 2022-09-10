package com.deanntu.three.questTwo.manager;

import java.sql.ResultSet;

import com.deanntu.three.questTwo.entity.Department;


public class DepartmentManager extends Manager<Department> {

    protected Department parse(ResultSet resultSet) throws Exception {

        long departmentId = resultSet.getLong("departmentId");
        String departmentName = resultSet.getString("departmentName");
        Department department = new Department(departmentId, departmentName);
        return department;
    }
}