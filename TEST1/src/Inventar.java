
public class Inventar {
	private String[] lista = new String[100];
	private Produs produs;
	private int i = 0;
	
	public Inventar(Produs p, String[] s) {
		this.lista = s;
		this.produs = p;
	}
	
	public String getNume() {
		return produs.getNume();
	}
	
	public int getCantitateInStoc() {
		return produs.getCantitateInStoc();
	}
	
	public void adaugaProdus(Produs p) {
		int ok = 1;
		for(int j=0; j<i; j++) {
			if(lista[j].equals(getNume())) {
				ok = 0;
			}
		}
		if(ok == 1 && getCantitateInStoc() > 0) {
			lista[i] = getNume();
			i++;
		}
		else {
			System.out.println("Cantitatea este 0 sau produsul se afla deja in lista");
		}
	}
	
	public void listeazaProduse() {
		for(int j=0; j<i; j++) {
			System.out.println(lista[j] + " ");
		}
	}
	
	public String gasesteProdusDupaNume(String nume) {
		int ok = 0;
		for(int j=0; j<i; j++) {
			if(nume.equals(lista[i])) {
				ok = 1;
			}
		}
		if(ok == 0) {
			return "Elementul nu se afla in lista";
		}
		else {
			return nume;
		}
	}
	
}

