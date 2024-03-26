package cviceni3;

public class BPIS implements Predmet {
	private int body;

	public int getBody() {
		return body;
	}

	public String getNazev() {
		return "BPIS";
	}

	public boolean jeZapocet() {
		if (body >= MIN_BODU) {
			return true;
		}
		return false;
	}
	
	public void udelZapocet(){
		body = MIN_BODU;
	}
}