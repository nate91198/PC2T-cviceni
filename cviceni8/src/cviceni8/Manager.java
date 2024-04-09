package cviceni8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Manager <T extends Employee> extends Employee {

	public Manager(String nickname, String email, char[] password) {
		super(nickname, email, password);
		listOfRealationships = new LinkedList<>();
		listOfEmployees = new LinkedList<>();
	}
	private List<T> listOfRealationships;
	
	public void addRelationship(T friend) {
		listOfRealationships.add(friend);
	}
	
	private List <Employee> listOfEmployees;
	
	public void addEmployee(Employee Zam) {
		listOfEmployees.add(Zam);
	}

	public List<T> getListOfRealationships() {
		return listOfRealationships;
	}

	public List<Employee> getListOfEmployees() {
		return listOfEmployees;
	}
	
	public void vypisPodrizenych() {
		Collections.sort((List<T>) listOfEmployees);
		for (Employee zam : listOfEmployees) {
			System.out.println(zam.getNickname());
		}
	}
	
}
