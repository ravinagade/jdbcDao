package com.spjdbc1.jdbc1.controller;


import com.spjdbc1.jdbc1.dao.EmployeeDao;
import com.spjdbc1.jdbc1.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/getemployees")
    public List<Employee> getEmp(){
        return employeeDao.getEmployeeList();
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@RequestBody Employee employee){
        return employeeDao.insertDate(employee);
    }

    @GetMapping("/getemp/{id}")
    public Employee getEmp(@PathVariable Integer id){
        return employeeDao.getEmployee(id);
    }

    @PutMapping("/updateEmployee")
    public String updateEmployee(@RequestBody Employee employee){
        return employeeDao.updateEmployee(employee);
    }
}
