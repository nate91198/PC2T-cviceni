package cviceni8;

public class Secretarian extends Employee{
	private int vek;

	public Secretarian(String nickname, String email, char[] password, int vek) {
		super(nickname, email, password);
		this.vek = vek;
	}

	public int getVek() {
		return vek;
	}
	
}
