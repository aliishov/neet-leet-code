package Easy;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int i;
		for (i = 0; i < nums.length; i++) {
			if (nums[i] != i) break;
		}

		return i;
	}
}
