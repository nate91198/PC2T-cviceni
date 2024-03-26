package cviceni2;

public class Zamestnanec {
	private String jmeno;
	private int rok;
	private float uvazek;

	private static float maximalni_uvazek = 1; // v pameti pouze jednou, plati pro vsechny zamestnance stejne

	Zamestnanec(String jmeno, int rok) {
		this.jmeno = jmeno;
		this.rok = rok;
	}

	String getJmeno() {
		return jmeno;
	}

	public int getRok() {
		return rok;
	}

	public float getUvazek() {
		return uvazek;
	}

	public static void setMaximalniUvazek(float max_uvazek) {
		maximalni_uvazek = max_uvazek;
	}

	public boolean navyseni_uvazku(float nav_uvazku) {
		if ((nav_uvazku < 0)||(uvazek + nav_uvazku) > maximalni_uvazek) {
			return false;
		} else {
			uvazek =+ nav_uvazku;
			return true;
		}
	}
}
