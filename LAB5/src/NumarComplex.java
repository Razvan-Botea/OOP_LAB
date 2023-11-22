
public class NumarComplex {
	private int parteRe;
	private int parteIm;
	
	public NumarComplex(int parteRe, int parteIm) {
		this.parteRe = parteRe;
		this.parteIm = parteIm;
	}
	
	public NumarComplex adunare(NumarComplex b) {
		NumarComplex rezultat = new NumarComplex(0, 0);
		rezultat.parteRe = b.parteRe + parteRe;
		rezultat.parteIm = b.parteIm + parteIm;
		return rezultat;
		
		// sau return new NumarComplex(b.parteRe + parteRe, b.parteIm + parteIm);
	}
	
	public NumarComplex scadere(NumarComplex b) {
		return new NumarComplex(parteRe - b.parteRe, parteIm - b.parteIm);
	}
	
	public NumarComplex prodScalar(int k) {
		NumarComplex rezultat = new NumarComplex(0, 0);
		rezultat.parteIm = parteIm * k;
		rezultat.parteRe = parteRe * k;
		return rezultat;
	}
	
	public NumarComplex prodComplex(NumarComplex b) {
		NumarComplex rezultat = new NumarComplex(0, 0);
		rezultat.parteRe = parteRe * b.parteRe - parteIm * b.parteIm;
		rezultat.parteIm = parteRe * b.parteIm + parteIm * b.parteRe;
		return rezultat;
	}
	
	public String toString() {
		return parteRe + "+" + parteIm + "*i";
	}
}
