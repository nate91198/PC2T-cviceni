package cviceni8;

public class Employee  implements Comparable<Employee>{
	private String nickname;
	private String email;
	private char[] password;

	private EmployeeType employeeType;

	enum EmployeeType {
		ACTIVE, INACTIVE, DELETED
	}

	public Employee(String nickname, String email, char[] password) {
		this.nickname = nickname;
		this.email = email;
		this.password = password;
		employeeType = employeeType.ACTIVE;
	}

	public String getNickname() {
		return nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmployeeType(EmployeeType type) {
		this.employeeType = type;
	}

	public EmployeeType getEmployeeType() {
		return employeeType;
	}

	@Override
	public int compareTo(Employee o) { //POROVNANI DVOU EMAILU
		return this.email.compareTo(o.email);
	}
	
}
