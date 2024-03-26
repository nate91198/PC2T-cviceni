package cviceni3;

public class Test {

	public static void main(String[] args) {
		BPC1 bpc1 = new BPC1();
		BPC2 bpc2 = new BPC2();
		BPIS bpis = new BPIS();

		bpc1.body_cviceni(3);
		bpc1.body_cviceni(2);
		bpc1.body_zkouska(30);

		bpc2.body_pulSem(10);
		bpc2.body_projekt(20);
		bpc2.body_zkouska(50);

		bpis.udelZapocet();

		Predmet predmety[] = new Predmet[3];

		predmety[0] = bpc1;
		predmety[1] = bpc2;
		predmety[2] = bpis;

		for (int i = 0; i < predmety.length; i++) {
			System.out.println("Predmet: " + predmety[i].getNazev());
			System.out.println("Zapocet: " + predmety[i].jeZapocet());
			System.out.println("Body: " + predmety[i].getBody());
			System.out.println();
		}
	}

}