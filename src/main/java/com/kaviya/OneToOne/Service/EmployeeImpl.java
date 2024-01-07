package com.kaviya.OneToOne.Service;

import com.kaviya.OneToOne.Dao.EmployeeRepo;
import com.kaviya.OneToOne.Dao.LocationRepo;
import com.kaviya.OneToOne.Entity.Employee;
import com.kaviya.OneToOne.Entity.Location;
import com.kaviya.OneToOne.Exception.EmployeeNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeImpl implements Model {
    @Autowired
    EmployeeRepo employeeRepo;
    @Autowired
    LocationRepo locoRepo;
    @Override
    public List<Employee> findAll(){
        List<Employee> li = employeeRepo.findAll();
        if(li.isEmpty())
        {
            throw new EmployeeNotFoundException("The table is Empty");
        }
        return li;
    }
    @Override
    public String create(Employee employee){
        if(employee.getId()==0)
            throw new EmployeeNotFoundException("Enter proper data");
        employeeRepo.save(employee);
        return "Inserted employee details successfully";
    }
    @Override
    public String countOfLocation(int id)
    {
        Location location = locoRepo.findById(id).orElse(null);
        String s = "The number of employees at "+location.getLocation()+" are "+employeeRepo.countByLocationId(id);
        return s;
    }
    @Override
    public Employee fetchByName(String name){
        return employeeRepo.findByName(name);
    }
//    @Override
//    public long CountEmployee(){
//
//        return  employeeRepo.count();
//    }
    @Override
    public Employee findById(int id){
        return employeeRepo.findById(id).orElse(null);
    }
    @Override
    public String update(Employee employee){
        employeeRepo.save(employee);
        return "The record have been updated";
    }
//    @Override
//    public List<Location> findLocation(){
//        return locoRepo.findAll();
//    }
    @Override
    public String deleteById(int id){
        employeeRepo.deleteById(id);
        return "Deleted the record on specified id";
    }
//    @Override
//    public List<Employee> findBySalary(double sal){
//        return employeeRepo.findBy(findBySalary());
//    }
}
