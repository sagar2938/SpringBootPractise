 package controllers.employee;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, String>{

	//getAllEmployees()
	//getEmployee(String id)
	//updateEmployee(Employee e)
	//deleteEmployee(String id)
	
	
}
