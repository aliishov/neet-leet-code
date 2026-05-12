package Easy;

public class ValidPalindrome {
	public boolean isPalindrome(String s) {
		s = s.toLowerCase();
		int left = 0, right = s.length() - 1;
		while (left < right)
		{
			char l = s.charAt(left);
			char r = s.charAt(right);

			if (!Character.isLetterOrDigit(l)) left++;
			else if (!Character.isLetterOrDigit(r)) right--;
			else if (l != r) return false;
			else {
				left++;
				right--;
			}
		}
		return true;
	}
}
