package demo;

public class Alien {
	private int age;
	private String planetFrom, name;
	private boolean needO2;
	private Calculator calculator;
	
	public int getAge() {
		return age;
	}
	public Calculator getCalculator() {
		return calculator;
	}
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPlanetFrom() {
		return planetFrom;
	}
	public void setPlanetFrom(String planetFrom) {
		this.planetFrom = planetFrom;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isNeedO2() {
		return needO2;
	}
	public void setNeedO2(boolean needO2) {
		this.needO2 = needO2;
	}
	@Override
	public String toString() {
		return "Alien [age=" + age + ", planetFrom=" + planetFrom + ", name=" + name + ", needO2=" + needO2
				+ ", calculator=" + calculator + "]";
	}
	

}
