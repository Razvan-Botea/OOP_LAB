
public class MainClass {

	public static void main(String[] args) {
//		NumarComplex a = new NumarComplex(2, 3);
//		NumarComplex b = new NumarComplex(7, 11);
//		
//		NumarComplex suma = new NumarComplex(0, 0);
//		suma = suma.adunare(b);
//		System.out.println(suma);
//		
//		suma = suma.adunare(a);
//		System.out.println(suma);
//		
//		suma = suma.prodScalar(2);
//		System.out.println(suma);
//		
//		suma = suma.scadere(b);
//		suma = suma.scadere(b);
//		System.out.println(suma);
		
//		int[] arr = new int[] {2, 6, 4, 8, 5};
//		int[] arr1 = arr;	//shallow copy
//		arr1[1] = 5;
//		System.out.println(arr[1]);
//		
//		for(int element: arr) {
//			System.out.print(element + " ");
//		}
		
		
		MatriceComplexa mat1 = new MatriceComplexa(2, 2);
		MatriceComplexa mat2 = new MatriceComplexa(2, 2);
		
		mat1.matrice[0][0] = new NumarComplex(1, 1);
		mat1.matrice[0][1] = new NumarComplex(1, 1);
		mat1.matrice[1][0] = new NumarComplex(1, 1);
		mat1.matrice[1][1] = new NumarComplex(1, 1);
		
		mat2.matrice[0][0] = new NumarComplex(1, 1);
		mat2.matrice[0][1] = new NumarComplex(1, 1);
		mat2.matrice[1][0] = new NumarComplex(1, 1);
		mat2.matrice[1][1] = new NumarComplex(1, 1);
		
		
	}
}
