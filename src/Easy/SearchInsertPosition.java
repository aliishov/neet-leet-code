package Easy;

public class SearchInsertPosition {
	public int searchInsert(int[] nums, int target) {
		int lowerBound = 0;
		int upperBound = nums.length - 1;
		int curIn;

		while (lowerBound <= upperBound) {
			curIn = lowerBound + (upperBound - lowerBound) / 2;

			if (nums[curIn] == target) return curIn;
			else if (nums[curIn] < target) lowerBound = curIn + 1;
			else upperBound = curIn - 1;

		}
		return lowerBound;
	}
}
