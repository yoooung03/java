package sec06;

class Line {
	private int l;

	public Line(int l) {
		this.l = l;
	}

	boolean idSameLine(Line n) {
		if (n.l == l)
			return true;
		return false;
	}
}

public class LineTest {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);

		System.out.println(a.idSameLine(b));
		System.out.println(a == b);
	}

}
