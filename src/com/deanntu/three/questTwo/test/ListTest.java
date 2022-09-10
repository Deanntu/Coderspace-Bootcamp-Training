package com.deanntu.three.questTwo.test;

import java.util.List;

import com.deanntu.three.questTwo.entity.Employee;
import com.deanntu.three.questTwo.manager.EmployeeManager;


public class ListTest {
    public static void main(String[] args) throws Exception {
        EmployeeManager employeeManager = new EmployeeManager();
        List<Employee> employeeList = employeeManager.list();
        for (Employee employee : employeeList) {
            System.out.println(employee.getEmployeeID() + " "
            +employee.getEmployeeName()+ " "
            +employee.getMonthlySalary());
        }
    }
    
}