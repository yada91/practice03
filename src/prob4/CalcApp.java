package prob4;

import java.util.Scanner;

import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory.Default;

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

			switch (str1[1]) {
			case "+":
				calc = new Add();
				calc.setValue(a, b);
				calc.calculate();
				break;
			case "-":
				calc = new Sub();
				calc.setValue(a, b);
				calc.calculate();
				break;
			case "*":
				calc = new Mul();
				calc.setValue(a, b);
				calc.calculate();
				break;
			case "/":
				calc = new Div();
				calc.setValue(a, b);
				calc.calculate();
				break;

			default:
				System.out.println("생선자 오류");
			}
			System.out.println(calc.calculate());
		}
	}
}
