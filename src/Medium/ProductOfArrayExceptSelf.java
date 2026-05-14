package Medium;

public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
		int totalProd = 1;
		int zeroCount = 0;

		for (int num : nums) {
			if (num != 0) totalProd *= num;
			else zeroCount++;
		}

		if (zeroCount > 1) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = 0;
			}
		} else if (zeroCount == 1) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[i] == 0 ? totalProd : 0;
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = totalProd / nums[i];
			}
		}

		return nums;
	}
}
