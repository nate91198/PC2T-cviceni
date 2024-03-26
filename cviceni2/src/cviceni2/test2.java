package cviceni2;

import java.util.Scanner;
import java.util.ArrayList;

public class test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Zamestnanec zamestnanci[] = new Zamestnanec[3];
		for (int i = 0; i < 3; i++) {
			System.out.println("Zadejte jmeno zamestnance");
			String jmeno = sc.next();

			int rok = 0;
			System.out.println("Zadejte rok narozeni zamestnance pro " + jmeno);
			while (!sc.hasNextInt()) {
				System.out.println("Zadejte rok narozeni pro zamestnance jmenem " + jmeno);
				sc.next();
			}
			rok = sc.nextInt();

			
			zamestnanci[i] = new Zamestnanec(jmeno, rok);

		}
		System.out.println("Zadejte maximalni uvazek: ");
		while (!sc.hasNextInt()) {
			System.out.println("Zadejte maximalni uvazek: ");
			sc.next();
			{
				float max_uvazek = sc.nextFloat();
				Zamestnanec.setMaximalniUvazek(max_uvazek);
			}
		}

		while (true) {
			System.out.println("Zajdete index zamestnance");
			while (!sc.hasNextInt()) {
				System.out.println("Zajdete index zamestnance");
				sc.next();
			}
			int idx = sc.nextInt();
			System.out.println("O kolik mam zamestnanci jmenem " + zamestnanci[idx].getJmeno() + " zvysit uvazek");
			while(!sc.hasNextFloat()) {
				System.out.println("O kolik mam zamestnanci jmenem " + zamestnanci[idx].getJmeno() + " zvysit uvazek");
				sc.next();
			}
			float nav_uvazku = sc.nextFloat();
			if (zamestnanci[idx].navyseni_uvazku(nav_uvazku));
				System.out.println("Novy uvazek cini" +zamestnanci[idx].getUvazek());
		}

	}
}
