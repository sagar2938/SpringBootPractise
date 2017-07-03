package controllers.computer;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import controllers.employee.Employee;

@Entity
public class Computer {
	@Id
	String id;
	String name;
	@ManyToOne
	Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Computer(String id, String name,String empId) {
		super();
		this.id = id;
		this.name = name;
		this.employee=new Employee(empId,",");
	}
	public Computer(){
		
	}
}
