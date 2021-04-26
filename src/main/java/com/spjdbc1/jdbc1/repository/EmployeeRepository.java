package com.spjdbc1.jdbc1.repository;

import com.spjdbc1.jdbc1.model.Employee;

import java.util.List;

public interface EmployeeRepository {

   List<Employee> getEmployeeList();

   String insertDate(Employee employee);

   Employee getEmployee(Integer id);

   String updateEmployee(Employee employee);

}
