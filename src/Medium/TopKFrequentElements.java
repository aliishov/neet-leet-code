package Medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> frequentMap = new HashMap<>();
		int[] result = new int[k];

		for (int n : nums) {
			frequentMap.put(n, frequentMap.getOrDefault(n, 0) + 1);
		}

		List<Integer> list = new ArrayList<>(frequentMap.keySet());
		list.sort((a, b) -> frequentMap.get(b) - frequentMap.get(a));

		for (int i = 0; i < k; i++) {
			result[i] = list.get(i);
		}

		return result;
	}
}
