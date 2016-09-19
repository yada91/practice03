package prob1;

public class Prob1 {

	public static void main(String args[]) {

		char[] array1 = reverse("Hello World");
		printCharArray(array1);

		char[] array2 = reverse("Java Programming!");
		printCharArray(array2);

	}

	public static char[] reverse(String str) {

		char[] result = new char[str.length()];
		int index = str.length() - 1;
		for (int i = 0; i < str.length(); i++) {
			result[index] = str.charAt(i);
			index--;
		}
		return result;
	}

	public static void printCharArray(char[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
