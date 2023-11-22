
public class Autovehicul {
	Sofer sofer;
	double maxVit;
	double crntVit;
	
	public Autovehicul(Sofer s) {
		this.sofer = s;
	}
	
	public Autovehicul() {
	}
	
	void accelereaza(int delta) {
		crntVit += delta;
	}
	
	void accelereaza(double delta) {
		crntVit += delta;
	}
}

