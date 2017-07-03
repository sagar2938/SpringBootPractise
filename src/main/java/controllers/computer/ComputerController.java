package controllers.computer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComputerController {
	
	@Autowired
	private ComputerService computerService;

	@RequestMapping("/computers")
	public List<Computer>getAllComputers(){
		return computerService.getAllComputers();
	}
	
	@RequestMapping("/computers/{id}")
	public Computer getComputer(@PathVariable("id") String id){
		return computerService.getComputer(id);
	}
	
	@RequestMapping("/employee/{empId}/computers")
	public List<Computer>getComputersEmployee(@PathVariable String empId){
		return computerService.getComputersEmployee(empId);
	}
	@RequestMapping("/computer/{compId}/employee/{empId}")
	public void allocateComputerEmployee(@PathVariable String compId,@PathVariable String empId){
		System.out.println("computerId --> "+compId+"  empId -> "+empId);
		 computerService.allocateComputerEmployee(compId,empId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/computers")
	public void addComputer(@RequestBody Computer computer){
		computerService.addComputer(computer);
		
	}
	@RequestMapping(method=RequestMethod.PUT,value="/computers/{id}")
	public void putComputer(@RequestBody Computer computer,@PathVariable String id){
		computerService.updateComputer(computer,id);
		
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/computers/{id}")
	public void deleteComputer(@RequestBody Computer computer,@PathVariable String id){
		computerService.deleteComputer(computer,id);
		
	}
	
}
