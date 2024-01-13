package com.emp.sys.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emp.sys.entity.Employee;
import com.emp.sys.repository.EmpRepo;

@Service
public class EmpService {

	
	@Autowired
	private EmpRepo repo;
	
	
	
	public void addemp(Employee e) {
		repo.save(e);
		
	}
	
	public List<Employee> getEmps() {
		return repo.findAll();
	}
	
	public Employee getEmpid(int id) {
		Optional<Employee>e= repo.findById(id);
		 if(e.isPresent()) {
			 return e.get();
		 }
		 return null;
	}
	
	public void deleteEmp(int id) {
		repo.deleteById(id);
	}
}
