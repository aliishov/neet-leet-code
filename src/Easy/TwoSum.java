package Easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> numsMap = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];

			int c = target - num;

			if (numsMap.containsKey(c)) {
				return new int[]{numsMap.get(c), i};
			}

			numsMap.put(num, i);
		}
		return new int[]{};
	}
}
