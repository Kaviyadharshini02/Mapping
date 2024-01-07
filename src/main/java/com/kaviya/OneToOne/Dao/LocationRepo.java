package com.kaviya.OneToOne.Dao;

import com.kaviya.OneToOne.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepo extends JpaRepository<Location,Integer> {

}
