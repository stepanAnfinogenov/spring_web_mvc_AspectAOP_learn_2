package com.anfinogenov.spring.mvc_hibernate_aop.dao;

import com.anfinogenov.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDao {
    public List<Employee> getAllEmployees();

    public void saveEmployee(Employee employee);

    public Employee getEmployees(int id);
    public void deleteEmployee(int id);
}
