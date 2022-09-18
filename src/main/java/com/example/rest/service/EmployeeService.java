package com.example.rest.service;

import com.example.rest.controller.model.Employee;
import com.example.rest.model.Employees;
import com.example.rest.repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeDAO employeeDAO;
    public Employees getAllEmployees() {

        //business logic, other API call and db operations

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Employee("1", "abc", "xyz", "abc@g.com"));
        employeeList.add(new Employee("2", "asd", "fsa", "asd@g.com"));

        Employees employees = new Employees();
        employees.setEmployeeList(employeeList);

        return employees;

    }
}
