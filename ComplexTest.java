package sec06;

class Complex {
	private double a1 = 0.0, a2 = 0.0;

	public Complex(double a1) {
		this.a1 = a1;
	}

	public Complex(double n1, double n2) {
		this.a1 = a1;
		this.a2 = a2;
	}

	public void print() {
		System.out.println(a1 + " + " + a2 + "i");
	}
}

public class ComplexTest {
	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}

}
