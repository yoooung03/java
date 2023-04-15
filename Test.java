/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Test {
 * 
 * public static void main(String[] args) { int result; int n;
 * System.out.print("팩토리얼 값을 구할 정수 : "); Scanner in = new Scanner(System.in);
 * 
 * n = in.nextInt(); result = 1; while (n > 0) { result *= n; n--; }
 * System.out.println(result); }
 * 
 * }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Test1 {
 * 
 * public static void main(String[] args) { int result; int n;
 * System.out.print("팩토리얼 값을 구할 정수 : "); Scanner in = new Scanner(System.in);
 * 
 * n = in.nextInt(); result = 1; while (true) { if (n <= 0) { break; } result *=
 * n; n--;
 * 
 * } System.out.println(result);
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
 * public class Test2 {
 * 
 * public static void main(String[] args) { int result; int n; Scanner in = new
 * Scanner(System.in);
 * 
 * System.out.print("팩토리얼 값을 구할 정수 : "); n = in.nextInt();
 * 
 * result = factorial(n); System.out.println(result); }
 * 
 * static int factorial(int x) { int r = 1; while (x > 0) { r *= x; x--; }
 * return r;
 * 
 * } }
 */
/*
 * package sec06;
 * 
 * public class Test3 { public static void main(String[] args) {
 * 
 * System.out.println(factorial(5)); System.out.println(factorial(1, 5));
 * System.out.println(factorial(3, 5)); System.out.println(factorial(10, 5)); }
 * 
 * static int factorial(int x) { int r = 1; while (x > 0) { r *= x; x--; }
 * return r; }
 * 
 * static int factorial(int x, int y) { int r = 1; while (x <= y) { r *= x; x++;
 * } return r; } }
 */
/*
 * package sec06;
 * 
 * import java.util.Scanner;
 * 
 * public class Test6 {
 * 
 * public static void main(String[] args) { Scanner in = new Scanner(System.in);
 * 
 * System.out.print("철수 : "); String c = in.next();
 * 
 * System.out.print("영희 : "); String y = in.next();
 * 
 * if (c.equals("s")) if (y.equals("p")) System.out.print("철수, 승!"); else if
 * (y.equals("r")) System.out.print("영희, 승!"); else if (y.equals("s"))
 * System.out.print("비겼다!");
 * 
 * if (c.equals("r")) if (y.equals("p")) System.out.print("영희, 승!"); else if
 * (y.equals("s")) System.out.print("철수, 승!"); else if (y.equals("r"))
 * System.out.print("비겼다!");
 * 
 * if (c.equals("p")) if (y.equals("r")) System.out.print("철수, 승!"); else if
 * (y.equals("s")) System.out.print("영희, 승!"); else if (y.equals("p"))
 * System.out.print("비겼다!");
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
 * public class Test7 { public static void main(String[] args) { String c =
 * input("철수"); String y = input("영희"); whosWin(c, y); }
 * 
 * static String input(String p) { Scanner in = new Scanner(System.in);
 * System.out.print(p + " : "); p = in.next(); return p; }
 * 
 * static void whosWin(String a, String b) { if (a.equals(b))
 * System.out.println("비겼다"); else if (a.equals("s") && b.equals("p") ||
 * a.equals("p") && b.equals("r") || a.equals("r") && b.equals("s"))
 * System.out.println("철수, 승!"); else if (a.equals("p") && b.equals("s") ||
 * a.equals("r") && b.equals("p") || a.equals("s") && b.equals("r"))
 * System.out.println("영희, 승!");
 * 
 * } }
 */