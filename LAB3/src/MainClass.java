import java.util.Scanner;

public class MainClass {
	
	public static boolean prim(int m){
		for(int i=2; i<=Math.sqrt(m); i++) {
			if(m%i == 0)
				return false;
		}
		return true;
	}
	
	public static void PerechePrim(int m) {
		for(int i=2; i<m; i++) {
			if(prim(i) && prim(m-i)) {
				System.out.println(m + "=" + i + "+" + (m-i));
				return;
			}
		}
		System.out.println("Error");
		return;
	}
	
	public static void main(String[] args) {
		int varsta = 25;
		int gen = 1;
		int inaltime = 176;
		
		short wrap = 0;
		wrap = (short)varsta;
		wrap = (short)((wrap << 1) | gen);
		wrap = (short)((wrap << 8) | inaltime);
		
		inaltime = wrap & 0xff;
		gen = (wrap >>> 8) & 1;
		varsta = (wrap >>> 9) & 0x7f;
		
		//System.out.println(inaltime);
		//System.out.println(varsta);
		//System.out.println(gen);
		
		String str1 = "Hello ";
		String str2 = "world";
		String Str3 = str1 + str2;
		
		//System.out.println(Str3);
		//System.out.println(Str3 == "Hello world");
		//System.out.println(Str3.equals("Hello world"));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("n=");
		int n = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("m=");
		int m = scanner.nextInt();
		scanner.nextLine();
		
		
		if(n%2 == 1)
			n++;
		if(m%2 == 1)
			m--;
		
		for(int i=n; i<=m; i+=2) {
			PerechePrim(i);
		}
		
		String str = "Ana are mere";
		str = str.toLowerCase();
		int v = 0;
		int c = 0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' ||
					str.charAt(i) == 'e' ||
					str.charAt(i) == 'i' ||
					str.charAt(i) == 'o' ||
					str.charAt(i) == 'u') 
				v++;
			else if(str.charAt(i) != ' ')
				c++;
		}
		
		System.out.println("Numarul de vocale este: " + v);
		System.out.println("Numarul de consoane este: " + c);
		
	}
	
}