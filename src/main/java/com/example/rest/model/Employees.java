package com.example.rest.model;

import com.example.rest.controller.model.Employee;

import java.util.List;

public class Employees {

    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
