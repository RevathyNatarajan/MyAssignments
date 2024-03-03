package week1.day4.homeassignments;

public class OddIndexToUppercase {

	public static void main(String[] args) {
		String str = "changeme";
		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			if (i % 2 != 0) {
				System.out.print(Character.toUpperCase(charArray[i]));
			} else {
				System.out.print(charArray[i]);
			}
		}
	}
}
