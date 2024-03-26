package cviceni3;

public class BPC2 implements Predmet {
	private int body_projekt;
	private int body_pulSem;

	public int getBody() {
		return body_projekt + body_pulSem;
	}

	public String getNazev() {
		return "BPC2";
	}

	public boolean jeZapocet() {
		if (body_projekt >= MIN_BODU) {
			return true;
		}
		return false;
	}

	public void body_projekt(int body) {
		if (body < 30) {
			this.body_projekt =+ body;
		}
	}

	public void body_zkouska(int body) {
		if (this.body_pulSem + body < 80) {
			body = +body_pulSem;
		}
	}
	public void body_pulSem(int body) {
		if (this.body_pulSem + body < 80) {
			body = +body_pulSem;
		}
	}
}
