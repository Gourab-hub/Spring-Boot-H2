package com.example.demo.repository;

import java.util.List;

import javax.transaction.Transactional;

import com.example.demo.entity.ModelEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;



public interface EmployeeRepository extends JpaRepository<ModelEntity, Integer>{

	ModelEntity findByemployeeId(Integer departmentId);

    @Query(value="SELECT * FROM EMPLOYEE WHERE CITY=:place", nativeQuery = true)
    public List<ModelEntity> findEmployeeBycity(String place);

    
    
    @Modifying
    @Transactional
    @Query(value="UPDATE EMPLOYEE SET PRIMARY_SKILL=:primarySkill,SECONDARY_SKILL=:secondarySkill WHERE EMPLOYEE_ID=:id", nativeQuery = true)
    void updateEmployeeSkillsById(int id, String primarySkill, String secondarySkill);





}

