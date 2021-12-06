package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.model.CatagoryStatus;

@Repository
public interface CategoryStatusRepository extends JpaRepository<CatagoryStatus,Integer>{

}
