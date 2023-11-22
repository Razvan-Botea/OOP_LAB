
public class Ghiozdan {
	Rechizita[] rec;
	private int i = 0;
	
	public void addCaiet(Caiet c) {
		rec[i] = c;
		i++;
	}
	
	public void addManual(Manual m) {
		rec[i] = m;
		i++;
	}
	
	public void listItems() {
		for(int j=0; j<i; j++)
			System.out.println(rec[j]);
	}
	
	public void listManual() {
		for(int j=0; j<i; j++) {
			if(rec[j] instanceof Manual)
				System.out.println(rec[j]);
		}
	}
	
	public void listCaiet() {
		for(int j=0; j<i; j++) {
			if(rec[j] instanceof Caiet)
				System.out.println(rec[j]);
		}
	}
	
	
}
