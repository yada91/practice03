package prob4;

public class Add extends Calc {
	private int a;
	private int b;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	int calculate() {

		return a + b;
	}
}
