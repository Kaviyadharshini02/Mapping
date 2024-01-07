package com.kaviya.OneToOne.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.engine.internal.Cascade;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_info_id")
    private EmployeeDetail employeeDetail;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_info")
   // @JsonBackReference
     private Location location;
}