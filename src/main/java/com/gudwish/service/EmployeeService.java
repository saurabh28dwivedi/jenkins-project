package com.gudwish.service;

import java.util.List;

import com.gudwish.entity.Employee;

public interface EmployeeService {
     
    public List<Employee> getAllEmployees() ;
  
    public Employee getEmployeeById(Long id)  ;
     
    public Employee createOrUpdateEmployee(Employee entity) ;
     
    public void deleteEmployeeById(Long id) ;
   
}