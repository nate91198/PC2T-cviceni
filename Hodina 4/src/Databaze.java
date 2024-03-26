import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Databaze {
	public Databaze() {
		prvkyDatabaze = new HashMap<>();
		sc = new Scanner(System.in);
	}

	public void setStudent() {
		System.out.println("Zadejte jmeno studenta, rok narozeni");
		String jmeno = sc.next();
		int rok = sc.nextInt();
		prvkyDatabaze.put(jmeno, new Student(jmeno, rok));
	}

	public Student getStudent(String jmeno) {
		return prvkyDatabaze.get(jmeno);
	}

	public boolean setPrumer(String jmeno, float prumer) {
		if (prvkyDatabaze.containsKey(jmeno)) {
			prvkyDatabaze.get(jmeno).setStudijniPrumer(prumer);
			return true;
		}
		return false;

	}

	public void vypisStudentu() {
		Set<String> keys = prvkyDatabaze.keySet();
		for (String key : keys)
			System.out.println(key);
	}

	public boolean odstranStudenta(String jmeno) {
		if (prvkyDatabaze.remove(jmeno) != null) {
			return true;
		}
		return false;
	}

	public void vypisStudentuDlePrumeru() {
		ArrayList<Float> prumery = new ArrayList<Float>();
		Set<String> keys = prvkyDatabaze.keySet();
		for (String key : keys)
			prumery.add(prvkyDatabaze.get(key).getStudijniPrumer());
		Collections.sort(prumery);
		for (Float i : prumery)
			System.out.println(i);
	}

	private Scanner sc;
	private HashMap<String, Student> prvkyDatabaze;
	private int posledniStudent;
}