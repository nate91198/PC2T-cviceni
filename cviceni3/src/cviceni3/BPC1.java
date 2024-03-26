package cviceni3;

public class BPC1 implements Predmet {
	private int body_cviceni;
	private int body_zkouska;

	public int getBody() {
		return body_cviceni + body_zkouska;
	}

	public String getNazev() {
		return "BPC1";
	}

	public boolean jeZapocet() {
		if (body_cviceni >= MIN_BODU) {
			return true;
		}
		return false;
	}

	public void body_cviceni(int body) {
		if (this.body_cviceni + body <= 20) {
			this.body_cviceni += body;
		}
	}

	public void body_zkouska(int body) {
		if (this.body_zkouska + body < 80) {
			body = +body_zkouska;
		}
	}
}
