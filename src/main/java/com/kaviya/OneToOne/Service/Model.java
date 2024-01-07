package com.kaviya.OneToOne.Service;

import com.kaviya.OneToOne.Entity.Employee;
import com.kaviya.OneToOne.Entity.Location;

import java.util.List;

public interface Model {
    List<Employee> findAll();
    String create(Employee employee);
    Employee findById(int id);
   // List<Location> findLocation();
    String update(int id,Employee employee);
   // String partialUpdate(Employee employee);
    String deleteById(int id);
    Employee fetchByName(String name);
   String countOfLocation(int id);
    //List<Employee> findBySalary(double salary);
}
