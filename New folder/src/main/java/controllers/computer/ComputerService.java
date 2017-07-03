package controllers.computer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import controllers.employee.Employee;

@Service
public class ComputerService {
	
	@Autowired
	private ComputerRepository computerRepository;

	public List<Computer>getAllComputers(){
		//return topics;
		List<Computer>computers=new ArrayList<>();
		Iterator<Computer> iterator=computerRepository.findAll().iterator();
		while(iterator.hasNext()){
			computers.add(iterator.next());
		}
		return computers;
	}
	
	public List<Computer>getComputersEmployee(String empId){
		return computerRepository.findComputersByEmployeeId(empId);
	}
	public Computer getComputer(String id){
		return computerRepository.findOne(id);
	}
	public String addComputer(Computer computer){
		computerRepository.save(computer);
		return "success";
	}
	
	public void updateComputer(Computer computer, String id) {
		// TODO Auto-generated method s
		computerRepository.save(computer);
		
		
	}
	
	public void allocateComputerEmployee(String compId,String empId){
		Computer comp=computerRepository.findOne(compId);
		if(comp !=null){
			comp.setEmployee(new Employee(empId,","));
			computerRepository.save(comp);
		}
	}
	public void deleteComputer(Computer computer, String id) {
		// TODO Auto-generated method stub
		computerRepository.delete(id);
	}
}
