package com.kaviya.OneToOne.Dao;

import com.kaviya.OneToOne.Entity.EmployeeDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsRepo extends JpaRepository<EmployeeDetail,Integer> {
}
