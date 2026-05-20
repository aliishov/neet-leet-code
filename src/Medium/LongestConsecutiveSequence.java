package Medium;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	public int longestConsecutive(int[] nums) {
		if (nums.length == 0)
			return 0;

		Set<Integer> numSet = new HashSet<>();
		for (int num : nums) {
			numSet.add(num);
		}

		int longestSequence = 0;
		for (int num : numSet) {
			if (!numSet.contains(num - 1)) {
				int currentSequence = 1;
				int currentNum = num;
				while (numSet.contains(currentNum + 1)) {
					currentSequence++;
					currentNum++;
				}
				longestSequence = Math.max(longestSequence, currentSequence);
			}
		}

		return longestSequence;
	}
}
