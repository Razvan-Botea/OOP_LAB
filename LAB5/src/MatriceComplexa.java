
public class MatriceComplexa {
	NumarComplex[][] matrice;
	
	MatriceComplexa(int rows, int col){
		matrice = new NumarComplex[rows][col];
	}
	
	public MatriceComplexa adunareMatrice(MatriceComplexa k, int n) {
		MatriceComplexa rezultat = new MatriceComplexa(n, n);
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				rezultat.matrice[i][j] = this.matrice[i][j].adunare(k.matrice[i][j]);
			}
		}
		return rezultat;
	}
}
