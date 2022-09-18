package com.example.rest.controller;

import com.example.rest.controller.model.Employee;
import com.example.rest.model.Employees;
import com.example.rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/all", produces = "application/json")
    public ResponseEntity<Employees> getEmployees()
    {
        Employees allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.ok().body(allEmployees);
    }

}
