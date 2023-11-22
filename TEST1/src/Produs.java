
public class Produs {
	private String nume;
	private int pret;
	private int cantitateInStoc;
	private Furnizor furnizor;
	
	public Produs(String n, int p, int c, Furnizor f) {
		this.nume = n;
		this.pret = p;
		this.cantitateInStoc = c;
		this.furnizor = f;
	}
	
	public Produs() {
		
	}
	
	public String getNume() {
		return nume;
	}
	
	public int getPret() {
		return pret;
	}
	
	public int getCantitateInStoc() {
		return cantitateInStoc;
	}
	
	public void setCantitateInStoc(int c) {
		this.cantitateInStoc = c;
	}
	
	public Furnizor getFurnizor() {
		return furnizor;
	}
	
	public void setFurnizor(String nSRL, String info, int bilant) {
		furnizor.setNumeSRL(nSRL);
		furnizor.setInfoFiscal(info);
		furnizor.setBilant(bilant);
	}
	
	public String toString() {
		return "Produsul se numeste "+nume+", costa "+pret+", in stoc avem "+cantitateInStoc+", iar furnizorul este "+furnizor;
	}
}
