
public class Autobuz extends Autovehicul {
	int ruta;
	
	public Autobuz(int r) {
		this.ruta = r;
	}
	
	void accelereaza(int delta) {
		if(crntVit < maxVit) {
			crntVit += delta;
		}
	}
}
