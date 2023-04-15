package sec06;

class Triangle {
	private double a;
	private double b;

	public Triangle(double a, double b) {
		this.a = a;
		this.b = b;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double findArea() {
		return 1.0 / 2.0 * a * b;
	}

	boolean isSameArea(Triangle x) {
		if (x.findArea() == findArea())
			return true;
		else
			return false;
	}
}

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);

		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));

	}
}
