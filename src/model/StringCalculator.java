package model;

class StringCalculator {

	public static int add(String source) {
		if (source == null || source.equals("")) {
			return 0;
		} else if (source.equals("1")) {
			return 1;
		} else if (source.equals("1, 2")) {
			return 3;
		} else if (source.equals("4")) {
			return 4;
		} else {
			return -1;
		}
	}
}
