package controllers.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	public List<Employee>getAllEmployees(){
		//return topics;
		List<Employee>employees=new ArrayList<>();
		Iterator<Employee> iterator=employeeRepository.findAll().iterator();
		while(iterator.hasNext()){
			employees.add(iterator.next());
		}
		return employees;
	}
	
	public Employee getEmployee(String id){
		return employeeRepository.findOne(id);
	}
	public String addEmployee(Employee employee){
		employeeRepository.save(employee);
		return "success";
	}

	public void updateEmployee(Employee employee, String id) {
		// TODO Auto-generated method s
		employeeRepository.save(employee);
		
		
	}

	public void deleteEmployee(Employee employee, String id) {
		// TODO Auto-generated method stub
		employeeRepository.delete(id);
	}
}
