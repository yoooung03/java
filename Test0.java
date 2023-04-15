/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class _number {
 * 
 * public static void main(String[] args) {
 * 
 * int number; int sum = 0; Scanner in = new Scanner(System.in);
 * 
 * System.out.print("0~999 사이의 숫자를 입력하세요: "); number = in.nextInt();
 * 
 * while (number != 0) { sum += number % 10; number /= 10; }
 * 
 * System.out.print("각 자릿수의 합 = " + sum); }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Area {
 * 
 * public static void main(String[] args) {
 * 
 * double w, h, area;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("직사각형의 가로를 입력하세요: "); w = in.nextDouble();
 * 
 * System.out.print("직사각형의 세로를 입력하세요: "); h = in.nextDouble();
 * 
 * area = w * h;
 * 
 * System.out.printf("직사각형의 넓이는 %3.1f입니다", area);
 * 
 * }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Credit {
 * 
 * public static void main(String[] args) { Double major, art, general; Double
 * sum = 0.0;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("전공 이수 학점: "); major = in.nextDouble(); sum += major;
 * 
 * System.out.print("교양 이수 학점: "); art = in.nextDouble(); sum += art;
 * 
 * System.out.print("일반 이수 학점: "); general = in.nextDouble(); sum += general;
 * 
 * System.out.printf( sum >= 140 && major >= 70 && (art >= 30 && general >= 30
 * || art + general >= 80) ? "졸업 가능" : "졸업 불가능");
 * 
 * }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Cylinder {
 * 
 * public static void main(String[] args) { double r, h, v; double pi = 3.14;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("원기둥의 밑면 반지름은? "); r = in.nextDouble();
 * 
 * System.out.print("원기둥의 높이는? "); h = in.nextDouble();
 * 
 * v = pi * r * r * h; System.out.printf("원기둥의 부피는? %5.1f\n", v);
 * 
 * }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class LowerToUpper {
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * char low;
 * 
 * System.out.print("소문자를 입력하세요: "); low = in.next().charAt(0);
 * 
 * int upper = (int) low; upper = low - 32;
 * 
 * char output = (char) upper; System.out.print("대문자로 변환된 문자: " + output);
 * 
 * }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Number {
 * 
 * public static void main(String[] args) {
 * 
 * int number;
 * 
 * Scanner in = new Scanner(System.in);
 * 
 * System.out.print("정수를 입력하세요: "); number = in.nextInt();
 * 
 * System.out.println(number % 2 == 0 ? "짝수" : "홀수"); }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * public class String2Demo {
 * 
 * public static void main(String[] args) { String s1 = "Hi, Java!"; String s2 =
 * new String("Hi, Java!"); String s3 = "Hi, Code!"; String s4 = "Hi, java!";
 * 
 * System.out.println(s1.equals(s2)); System.out.println(s1.equals(s3));
 * System.out.println(s1.equals(s4));
 * System.out.println(s1.equalsIgnoreCase(s4));
 * 
 * System.out.println(s1.compareTo(s3));
 * System.out.println(s1.compareToIgnoreCase(s4));
 * System.out.println(s3.compareTo(s4));
 * System.out.println("Hi, Java!".compareToIgnoreCase("hi, java!"));
 * 
 * }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * public class T3 {
 * 
 * public static void main(String[] args) { int i1 = 0 * 11, i2 = 5; final int
 * ONE = 1; char c1 = 'a'; float f1 = 1.5f; double d1 = 2.8; boolean b1 = true;
 * 
 * System.out.printf("i1 = %d\n", i1); System.out.printf("i1/2 = %d\n", i1 / 2);
 * System.out.println("c1 + ONE = " + c1 + ONE);
 * System.out.println("(int)c1 + ONE = " + (int) c1 + ONE);
 * System.out.printf("(c1 + ONE) = %d\n ", c1 + ONE);
 * System.out.printf("(c1 + ONE) = %c\n ", c1 + ONE);
 * System.out.printf("(c1 + ONE) = %5s\n", c1 + ONE);
 * System.out.printf("i2 + f1 = %f\n", i2 + f1);
 * System.out.printf("f1 + d1 = %.1f\n", f1 + d1);
 * System.out.printf("(int)(f1 + d1) = %d\n", (int) (f1 + d1));
 * System.out.printf("(int)f1 + (int)d1 = %d\n", (int) f1 + (int) d1);
 * System.out.printf("b1 = " + b1);
 * 
 * }
 * 
 * }
 */