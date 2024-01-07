package com.kaviya.OneToOne.Dao;

import com.kaviya.OneToOne.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

    long countByLocationId(int id);
    Employee findByName(String name);

}
