package prob4;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		// Scanner 와 String 클래스의 split 함수를 사용합니다.
		Scanner sc = new Scanner(System.in);
		Calc calc = new Calc();

		while (true) {
			System.out.println(">>");
			String str = sc.nextLine();
			if (str.equals("quit"))
				break;
			String[] str1 = str.split(" ");

			int a = Integer.parseInt(str1[0]);
			int b = Integer.parseInt(str1[2]);
			calc.setValue(a, b);

			switch (str1[1]) {
			case "+":
				calc.Add();
				break;
			case "-":
				calc.Sub();
				break;
			case "*":
				calc.Mul();
				break;
			case "/":
				calc.Div();
				break;
			}
			System.out.println(calc.calculate());
		}
	}
}
