package Medium;

import java.util.PriorityQueue;

public class KthLargestElementinanArray {
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
		for (int num : nums) {
			maxHeap.add(num);
			if (maxHeap.size() > k) maxHeap.remove();
		}
		return maxHeap.remove();
	}
}
