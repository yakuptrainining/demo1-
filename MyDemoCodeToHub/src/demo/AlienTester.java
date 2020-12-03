package demo;

public class AlienTester {

	public static void main(String[] args) {
		Alien a1 = new Alien();
		a1.setName("Hansi");
		a1.setAge(257);
		a1.setNeedO2(false);
		a1.setPlanetFrom("Zorkon");
		Calculator calc = new Calculator();
		calc.add(52, 99);
		calc.sub(36, 250);
		a1.setCalculator(calc);
		System.out.println(a1);
	
	
			

	}

}
