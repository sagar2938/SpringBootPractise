package controllers.employee;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import controllers.computer.Computer;

@Entity
public class Employee {
	@Id
	String id;
	String name;

	public Employee(String id,String name){
		this.id=id;
		this.name=name;

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
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
