package cviceni1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (sc.hasNextInt()) {
			int cislo = sc.nextInt();
			boolean jePrvocislo = true;
			if (cislo > 2 && cislo % 2 == 0) {
				System.out.println("Nejedna se o prvocislo, cislo" + cislo + "je delitelne cislem" + 2);
				jePrvocislo = false;
			} else {
				System.out.println("Jedna se o prvocislo");
			}

		}
		System.out.println("Nezadali jste cele cislo");

	}
}