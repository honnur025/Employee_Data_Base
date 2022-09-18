package emp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private Double salary;
	private String disig;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public String getDisig() {
		return disig;
	}
	public void setDisig(String disig) {
		this.disig = disig;
	}
	
	
}
