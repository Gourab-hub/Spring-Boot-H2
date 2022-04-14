package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ModelEntity;
import com.example.demo.request.EmployeRequest;
import com.example.demo.request.Expertise;
import com.example.demo.service.EmployeeService;
import com.example.demo.transformer.Transformer;



@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	@Autowired
	private Transformer transformer;
	
	
	
	@PostMapping("/saveEmployee")
	public String saveEmployeedetails(@RequestBody List<EmployeRequest> employeRequest ) {
		employeeService.saveEmployeeDetails(employeRequest);
		return "Saved Successfully";
		
	}

	
	@GetMapping("/getEmployee/{id}")
    public EmployeRequest findEmployee(@PathVariable("id") Integer id)
    {
		
//		System.out.println("departmentId"+departmentId);
		
		ModelEntity res =employeeService.findEmployeeDetails(id);
		EmployeRequest EmployeRequest= transformer.findbyId(res);
        return EmployeRequest;
    }
	
	@GetMapping("/findEmployeeByPlace")
    public List<EmployeRequest> findEmployeeByPlace(@RequestParam("place") String place)
    {
        List<ModelEntity> res =employeeService.findEmployeeBycity(place);  
        List<EmployeRequest> ans= transformer.findEmployeeBycity(res);
        return ans;
    }
	
	@PostMapping("/updateEmployeeSkills")
    public String updateEmployeeSkills(@RequestBody Expertise updateRequestbyId)
    {
        employeeService.updateEmployee(updateRequestbyId);  
        // EmployeRequest ans= transformer.findEmployeeBycity(res);
        
        // System.out.println(updateRequestbyId.getPrimary()+""+id);
        return "update successfuly";
    }
	


}
