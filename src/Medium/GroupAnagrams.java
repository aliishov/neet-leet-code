package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> res = new HashMap<>();

		for (String s : strs) {
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);

			String sortedStr = new String(charArray);

			if(!res.containsKey(sortedStr)) {
				res.put(sortedStr, new ArrayList<>());
			}

			res.get(sortedStr).add(s);
		}

		return new ArrayList<>(res.values());
	}
}
