package com.kaviya.OneToOne.Controller;

import com.kaviya.OneToOne.Entity.Employee;
import com.kaviya.OneToOne.Entity.Location;
import com.kaviya.OneToOne.Service.EmployeeImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeImpl employee;
    @GetMapping
    public List<Employee> fetchAll(){
        return employee.findAll();
    }
    @PostMapping
    public String create(@RequestBody Employee employee1){
        System.out.println(employee1.toString());
        return employee.create(employee1);
    }
    @GetMapping("/location/{id}")
    public String fetchLocation(@PathVariable int id)
    {
        return employee.countOfLocation(id);
    }
    @GetMapping("/{id}")
    public Employee fetchById(@PathVariable int id){
        return employee.findById(id);
    }
    @GetMapping("/name/{name}")
    public Employee fetchByName(@PathVariable String name){
        return employee.fetchByName(name);
    }
    @PutMapping("/{id}")
    public String update(@RequestBody  Employee employee1,@PathVariable int id){
        return employee.update(id,employee1);
    }
    @DeleteMapping("{id}")
    public String delete(@PathVariable int id){
        return employee.deleteById(id);
    }
//    @PatchMapping
//    public String  patch(@RequestBody Employee employee1)
//    {
//        return employee.update(employee1);
//    }
}
