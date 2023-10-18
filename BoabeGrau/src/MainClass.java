import java.math.BigInteger;

public class MainClass {

	public static void main(String[] args) {
		BigInteger nrBoabe = new BigInteger("0");
		int nrPatrate = 64;
		BigInteger k = new BigInteger("1");
		BigInteger d = new BigInteger("2");
		
		for(int i = 1; i <= nrPatrate; i++) {
			nrBoabe = nrBoabe.add(k);
			k = k.multiply(d);
		}
		
		System.out.println(nrBoabe);
	}

}
