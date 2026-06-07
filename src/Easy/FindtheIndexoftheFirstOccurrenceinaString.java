package Easy;

public class FindtheIndexoftheFirstOccurrenceinaString {
	public int strStr(String haystack, String needle) {
		int haystackLegth = haystack.length();
		int needleLength = needle.length();

		if (needleLength == 0) return 0;
		if (haystackLegth == 0 || haystackLegth < needleLength) return -1;

		for (int i = 0; i <= haystackLegth - needleLength; i++) {
			if (haystack.substring(i, i + needleLength).equals(needle)) return i;
		}

		return -1;
	}
}
