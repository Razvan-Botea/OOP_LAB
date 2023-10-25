import java.awt.Color;

public class Autovehicul {
	private String marca;
	private Color culoare;
	private float vitezaCurenta;
	private int vitezaMaxima;
	private int nrTrepte;
	private int treaptaCurenta;
	
	public Autovehicul(String m, Color c, int vm, int nt) {
		this.marca = m;
		this.culoare = c;
		this.vitezaMaxima = vm;
		this.nrTrepte = nt;
	}
	public Autovehicul() {
		
	}
	
	public String getMarca() {
		return marca;
	}
	public float getVitCurenta() {
		return vitezaCurenta;
	}
	public int getVitMaxima() {
		return vitezaMaxima;
	}
	public int getNrTrepte() {
		return nrTrepte;
	}
	public Color getColor() {
		return culoare;
	}
	
	
	public void accelerare(float delta) {
		this.vitezaCurenta += delta;
		if(vitezaCurenta >vitezaMaxima) {
			System.out.println("Viteza maxima a fost depasita");
			oprire();
		}
	}
	public void decelerare(float delta) {
		this.vitezaCurenta -= delta;
	}
	public void cresteTreapta(int delta) {
		if(treaptaCurenta >= nrTrepte){
			System.out.println("Ati ajuns la treapta maxima");
			oprire();
		}
		else
			this.treaptaCurenta += delta;
	}
	public void scadeTreapta(int delta) {
		this.treaptaCurenta -= delta;
	}
	public void oprire() {
		this.treaptaCurenta = 0;
		this.vitezaCurenta = 0;
	}
	
	public String toString() {
		return "Marca este " + marca + ", are viteza de " + vitezaCurenta + "km/h " + " si se afla in treapta " + treaptaCurenta;
	}
}
