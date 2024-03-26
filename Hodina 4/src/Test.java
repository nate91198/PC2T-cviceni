import java.util.Scanner;


public class Test {

	public static int pouzeCelaCisla(Scanner sc) 
	{
		int cislo = 0;
		try
		{
			cislo = sc.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("Nastala vyjimka typu "+e.toString());
			System.out.println("zadejte prosim cele cislo ");
			sc.nextLine();
			cislo = pouzeCelaCisla(sc);
		}
		return cislo;
	}
	


	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Databaze mojeDatabaze=new Databaze();
		float prumer;
		String jmeno;
		int volba;
		boolean run=true;
		while(run)
		{
			System.out.println("Vyberte pozadovanou cinnost:");
			System.out.println("1 .. vytvoreni nove databaze");
			System.out.println("2 .. vlozeni noveho studenta");
			System.out.println("3 .. nastaveni prumeru studenta");
			System.out.println("4 .. vypis informace o studentovi");
			System.out.println("5 .. vypise vsechny jmena studentu");
			System.out.println("6 .. odstrani studenta");
			System.out.println("7 .. vypis studentu dle prumeru");
			System.out.println("8 .. ukonceni aplikace");
			volba=pouzeCelaCisla(sc);
			switch(volba)
			{
				case 1:
					System.out.println("Vytvoril si databazi.");
					mojeDatabaze=new Databaze();
					break;
				case 2:
					mojeDatabaze.setStudent();
					break;
				case 3:
					System.out.println("Zadejte jmeno a prumer studenta");
					jmeno = sc.next();
					prumer =sc.nextFloat();
					mojeDatabaze.setPrumer(jmeno ,prumer);
					break;
				case 4:
					System.out.println("Zadejte jmeno studenta");
					jmeno=sc.next();
					Student info=mojeDatabaze.getStudent(jmeno);
					System.out.println("Jmeno: " + info.getJmeno() + " \nrok narozeni: " + info.getRocnik() + " \nprumer: " + info.getStudijniPrumer());
					break;
				case 5:
					System.out.println("Jmena vsech studentu: \n");
					mojeDatabaze.vypisStudentu();
					break;
				case 6:
					System.out.println("Zadejte jmeno studenta");
					jmeno=sc.next();
					mojeDatabaze.odstranStudenta(jmeno);
					break;
				case 7:
					mojeDatabaze.vypisStudentuDlePrumeru();
					break;
				case 8:
					run=false;
					break;
			}
			
		}
	}

}
