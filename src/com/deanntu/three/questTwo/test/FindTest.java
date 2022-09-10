package com.deanntu.three.questTwo.test;

import com.deanntu.three.questTwo.entity.Employee;
import com.deanntu.three.questTwo.manager.EmployeeManager;

public class FindTest {
    public static void main(String[] args) throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        Employee e = employeeManager.find(2);
        System.out.println(e.getEmployeeName());
    }
}