package com.example.demo.transformer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.entity.ModelEntity;
import com.example.demo.request.EmployeRequest;
import com.example.demo.request.Expertise;


@Component
public class Transformer {
//	@Autowired
//	private Expertise expertise ;


	public List<ModelEntity> transformModeltoEntity(List<EmployeRequest> rmployeRequest){
		
		List<ModelEntity> list = new ArrayList<>();
		
		for(EmployeRequest em : rmployeRequest ) {
			ModelEntity modelEntity =new ModelEntity();
			modelEntity.setEmployeeId(Integer.parseInt(em.getEmployeeId()) );
			modelEntity.setEmpoyeeName(em.getEmpoyeeName());
			modelEntity.setSalary(em.getSalary());
			modelEntity.setCity(em.getCity());
			modelEntity.setContact(em.getContact());
			modelEntity.setPincode(em.getPincode());
			for(Expertise ex: em.getExpertise()) {
				modelEntity.setPrimarySkill(ex.getPrimary());
				modelEntity.setSecondarySkill(ex.getSecondary());
			}
			list.add(modelEntity);
		}
	
		return list;
	}

	public EmployeRequest findbyId(ModelEntity res) {
		EmployeRequest employeRequest =new EmployeRequest();
		employeRequest.setEmployeeId(Integer.toString(res.getEmployeeId()));
		employeRequest.setEmpoyeeName(res.getEmpoyeeName());
		employeRequest.setSalary(res.getSalary());

		List<Expertise> list = new ArrayList<>();

		Expertise expertise = new Expertise();

		expertise.setPrimary(res.getPrimarySkill());
		expertise.setSecondary(res.getSecondarySkill());
		employeRequest.setExpertise(list);
		list.add(expertise);
		employeRequest.setCity(res.getCity());
		employeRequest.setPincode(res.getPincode());
		employeRequest.setContact(res.getContact());

		return employeRequest;
	}

	public List<EmployeRequest> findEmployeeBycity(List<ModelEntity> res) {

		List<EmployeRequest> list = new ArrayList<>();
		
		for(ModelEntity es:res) {
			EmployeRequest employeRequest =new EmployeRequest();
			employeRequest.setEmployeeId(Integer.toString(es.getEmployeeId()));
			employeRequest.setEmpoyeeName(es.getEmpoyeeName());
			employeRequest.setSalary(es.getSalary());
			employeRequest.setCity(es.getCity());
			employeRequest.setPincode(es.getPincode());
			employeRequest.setContact(es.getContact());
			List<Expertise> list1 = new ArrayList<>();

			Expertise expertise = new Expertise();
			expertise.setPrimary(es.getPrimarySkill());
			expertise.setSecondary(es.getSecondarySkill());
			list1.add(expertise);
			employeRequest.setExpertise(list1);
			list.add(employeRequest);

		}
		return list;
	}
	
	
}

