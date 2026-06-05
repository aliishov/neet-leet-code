package Easy;

public class RomantoInteger {
	public int romanToInt(String s) {
		char[] roman = s.toCharArray();
		int result = 0;

		for (int i = 0; i < roman.length; i++) {
			if (i < roman.length - 1) {
				if ((roman[i] == 'I' && (roman[i + 1] == 'V' || roman[i + 1] == 'X')) ||
						(roman[i] == 'X' && (roman[i + 1] == 'L' || roman[i + 1] == 'C')) ||
						(roman[i] == 'C' && (roman[i + 1] == 'D' || roman[i + 1] == 'M'))) {
					result -= getValue(roman[i]);
				} else {
					result += getValue(roman[i]);
				}
			} else {
				result += getValue(roman[i]);
			}
		}

		return result;
	}

	private int getValue(char romanChar) {
		return switch (romanChar) {
			case 'I' -> 1;
			case 'V' -> 5;
			case 'X' -> 10;
			case 'L' -> 50;
			case 'C' -> 100;
			case 'D' -> 500;
			case 'M' -> 1000;
			default -> 0;
		};
	}
}
