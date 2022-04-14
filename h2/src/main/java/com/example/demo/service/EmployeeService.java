package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.ModelEntity;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.request.EmployeRequest;
import com.example.demo.request.Expertise;
import com.example.demo.transformer.Transformer;

@Component
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository; 
	
	@Autowired
	private Transformer transformer;
	
	public void saveEmployeeDetails(List<EmployeRequest> rmployeRequest) {
		List<ModelEntity> entity= transformer.transformModeltoEntity(rmployeRequest);
		employeeRepository.saveAll(entity);
	}
	
	public ModelEntity findEmployeeDetails(Integer id) {
		
		ModelEntity entity= employeeRepository.findByemployeeId(id);
//		employeeRepository.saveAll(entity);
		
//		System.out.println(entity);
		return entity;
	}


	public List<ModelEntity> findEmployeeBycity(String place) {
		List<ModelEntity> entity= employeeRepository.findEmployeeBycity(place);
		return entity;
	}

    public void updateEmployee(Expertise updateRequestbyId) {
    	
		employeeRepository.updateEmployeeSkillsById(updateRequestbyId.getId(),updateRequestbyId.getPrimary(),updateRequestbyId.getSecondary());
    }

	
}
