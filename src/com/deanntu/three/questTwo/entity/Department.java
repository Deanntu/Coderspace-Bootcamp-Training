package com.deanntu.three.questTwo.entity;

public class Department {
    private long departmentID;
    private String departmentName;

    public Department() {
    }

    public Department(long departmentID, String departmentName) {
        this.departmentID = departmentID;
        this.departmentName = departmentName;
    }

    public long getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(long departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

}