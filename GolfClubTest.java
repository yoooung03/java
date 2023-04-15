package sec06;

class Golf {
	private int g = 0;
	private String a;

	public Golf() {
		g = 7;
	}

	public Golf(int g) {
		this.g = g;
	}

	public Golf(String a) {
		this.a = a;
	}

	public void print() {
		if (g > 0)
			System.out.println(g + "번 아이언입니다.");
		else if (!(a.equals("")))
			System.out.println(a + "입니다.");
	}
}

public class GolfClubTest {
	public static void main(String[] args) {
		Golf g1 = new Golf();
		g1.print();
		Golf g2 = new Golf(8);
		g2.print();
		Golf g3 = new Golf("퍼터");
		g3.print();
	}

}
