package com.deanntu.three.questTwo.manager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import com.deanntu.three.questTwo.entity.Employee;



public class EmployeeManager extends Manager<Employee> {
    public Employee find(long productId) throws Exception {
        Employee employee = null;

        connect();
        String sql = "select * from EMPLOYEE where employeeID=?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setLong(1, productId);
        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            employee = parse(resultSet);
        }
        disconnect();
        return employee;
    }

    public List<Employee> list() throws Exception {

        connect();
        String sql = "select * from Employee";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
        List<Employee> productList = parseList(resultSet);

        disconnect();

        return productList;
    }

    protected Employee parse(ResultSet resultSet) throws Exception {
        long employeeID = resultSet.getLong("employeeID");
        String employeeName = resultSet.getString("employeeName");
        double monthlySalary = resultSet.getDouble("monthlySalary");
        Employee employee = new Employee(employeeID, employeeName, monthlySalary);
        return employee;
    }
}