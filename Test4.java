
package sec06;

public class Test4 {
	public static void main(String[] args) {

		int x = 5;
		int y = 10;
		int z = ++x * y--;
		System.out.printf("%d\t%d\t%d\n", x, y, z);

		int year = 2020;
		System.out.println(year % 4 == 0 && year % 100 != 0 || year % 400 == 0);

		int x = 1;
		int y;
		y = (x == 1) ? 10 : 20;
		System.out.println(y);
		y = (x > 1) ? x++ : x + 20;
		System.out.println(x);
		System.out.println(y);

		int plusOne = 1;
		int minusOne = -plusOne;
		System.out.println("plusOne은" + plusOne + "입니다.");
		System.out.println("minusOne은" + minusOne + "입니다.");

		int x = 1, y = 1;
		System.out.println("x= " + x + ", ++x =" + ++x);
		System.out.println("y= " + y + ", y++ = " + y++);
		System.out.println("x= " + x + ", y= " + y);

		int value = 1;
		value += 1;
		System.out.println("값 = " + value);
		value -= 1;
		System.out.println("값 = " + value);
		value <<= 3;
		System.out.println("값 = " + value);
		value %= 3;
		System.out.println("값 = " + value);

		System.out.printf("%x\n", 0b0101 & 0b0011);
		System.out.printf("%x\n", 0b0101 | 0b0011);
		System.out.printf("%x\n", 0b0101 ^ 0b0011);
		System.out.printf("%x\n", (byte) ~0b00000001);
		System.out.printf("%x\n", 0b0110 >> 2);
		System.out.printf("%x\n", 0b0110 << 2);

		int i1 = -10;
		int i2 = i1 >> 1;
		int i3 = i1 >>> 1;
		System.out.printf("%x -> %d\n", i1, i1);
		System.out.printf("%x -> %d\n", i2, i2);
		System.out.printf("%x -> %d\n", i3, i3);

		int x = 0, y = 1;
		System.out.println((x < 1) || (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);

		x = 0;
		y = 1;
		System.out.println((x < 1) | (y-- < 1));
		System.out.println("x = " + x + ", y = " + y);

	}

}
