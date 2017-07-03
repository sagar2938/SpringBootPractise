package controllers.computer;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ComputerRepository extends CrudRepository<Computer, String>{

	public List<Computer>findComputersByEmployeeId(String id);
	
	
}
