
public class Furnizor {
	private String numeSRL;
	private String infoFiscal;
	private int bilant;
	
	public Furnizor(String nSRL, String info, int bilant) {
		this.numeSRL = nSRL;
		this.infoFiscal = info;
		this.bilant = bilant;
	}
	
	public Furnizor() {
		
	}
	
	public String getNumeSRL() {
		return this.numeSRL;
	}
	
	public void setNumeSRL(String nume) {
		this.numeSRL = nume;
	}
	
	public String getInfoFiscal() {
		return this.infoFiscal;
	}
	
	public void setInfoFiscal(String info) {
		this.infoFiscal = info;
	}
	
	public int getBilant() {
		return this.bilant;
	}
	
	public void setBilant(int b) {
		this.bilant = b;
	}
	
	public String toString() {
		return "Furnizorul se numeste "+numeSRL+" are codul fiscal "+infoFiscal+" si bilantul "+bilant;
	}
}
