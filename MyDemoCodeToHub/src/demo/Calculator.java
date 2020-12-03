package demo;

public class Calculator {
	private int resSub, resAdd;
	public int add(int num1, int num2) {
		resAdd = num1+num2;
		return resAdd;
	}
	
	public int getResSub() {
		return resSub;
	}

	public void setResSub(int resSub) {
		this.resSub = resSub;
	}

	public int getResAdd() {
		return resAdd;
	}

	public void setResAdd(int resAdd) {
		this.resAdd = resAdd;
	}

	public int sub(int num1, int num2) {
		resSub =num1-num2;
		return resSub;
	}

	@Override
	public String toString() {
		return "Calculator [resSub=" + resSub + ", resAdd=" + resAdd + "]";
	}

	
	
	

}
