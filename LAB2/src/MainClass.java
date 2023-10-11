import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputValue = input.nextInt();
		// System.out.println("Valoarea citita de la tastatura este " + inputValue);

		int maxInt = Integer.MAX_VALUE;
		// System.out.println(maxInt + 1);

		// int minInt = Integer.MIN_VALUE;
		// System.out.println(minInt - 1);

		// float maxFloat = Float.MAX_VALUE;
		// System.out.println(maxFloat * 3);

		// double maxDouble = Double.MAX_VALUE;
		// System.out.println(maxDouble * 3);

		try {
			System.out.println(maxInt / inputValue);
		} catch (ArithmeticException exception) {
			System.out.println("Ai introdus o valoare gresita, introdu o alta valoare");
			inputValue = input.nextInt();
		}
		System.out.println("Noua valoare: " + inputValue);

	}

}
