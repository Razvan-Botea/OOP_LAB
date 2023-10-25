import java.awt.Color;

public class MainClass {

	public static void main(String[] args) {
		
		Autovehicul auto = new Autovehicul("Audi", Color.BLUE, 200, 6);
		
//		auto.accelerare(20);
//		auto.cresteTreapta(1);
//		System.out.println(auto);
//		
//		auto.accelerare(50);
//		auto.cresteTreapta(3);
//		System.out.println(auto);
//		
//		auto.decelerare(30);
//		auto.scadeTreapta(1);
//		System.out.println(auto);
//		
//		auto.cresteTreapta(3);
//		auto.accelerare(250);
//		System.out.println(auto);
		
		auto.accelerare(180);
		auto.cresteTreapta(6);
		System.out.println(auto);
		
		auto.cresteTreapta(1);
		System.out.println(auto);
	}

}
