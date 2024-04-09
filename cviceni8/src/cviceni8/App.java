 package cviceni8;

public class App {

	public static void main(String[] args) {
		Manager<Secretarian> Man = new Manager("Karel", "karel@vut.cz", "heslo".toCharArray());
		Secretarian Sekretarka1 = new Secretarian("Jana", "jana@vut.cz", "heslo".toCharArray(), 30);
		Secretarian Sekretarka2 = new Secretarian("Daniel", "daniel@vut.cz", "heslo".toCharArray(), 28);
		Employee emp1 = new Employee("Jan", "jan@vut.cz", "heslo".toCharArray());
		Employee emp2 = new Employee("Pepa", "pepa@vut.cz", "heslo".toCharArray());
		
		Man.addEmployee(Sekretarka1);
		Man.addEmployee(Sekretarka2);
		Man.addEmployee(emp1);
		Man.addEmployee(emp2);
		
		Man.addRelationship(Sekretarka1);
		
		for (Employee zam : Man.getListOfEmployees()) {
			System.out.println(zam.getNickname());
		}
		
		for (Employee zam : Man.getListOfRealationships()) {
			System.out.println(zam.getNickname());
		}
		
		Man.vypisPodrizenych();
	}

}
