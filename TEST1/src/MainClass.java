
public class MainClass {

	public static void main(String[] args) {
		Produs p = new Produs();
		String[] s = new String[10];
		
		Inventar I = new Inventar(p, s);
		
		Furnizor f1 = new Furnizor("FarmSRL", "abcd", 1234);
		Furnizor f2 = new Furnizor("FermaSRL", "efgh", 5678);
		Furnizor f3 = new Furnizor("AdiSRL", "ijkl", 5678);
		
		Produs p1 = new Produs("Lapte", 8, 25, f1);
		Produs p2 = new Produs("Oua", 12, 30, f1);
		Produs p3 = new Produs("Paine", 4, 20, f3);
		Produs p4 = new Produs("Carne", 18, 15, f2);
		Produs p5 = new Produs("Faina", 6, 19, f3);
		
		I.adaugaProdus(p1);
		I.adaugaProdus(p2);
		I.adaugaProdus(p3);
		I.adaugaProdus(p4);
		I.adaugaProdus(p5);
		
		I.listeazaProduse();
		I.gasesteProdusDupaNume("Lapte");
	}

}
