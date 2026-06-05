package Easy;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesfromSortedArray {
	public int removeDuplicates(int[] nums) {
		Set<Integer> set = new HashSet<>();

		int index = 0;
		for (int num : nums) {
			if (!set.contains(num)) {
				nums[index++] = num;
				set.add(num);
			}
		}
		return set.size();
	}
}
