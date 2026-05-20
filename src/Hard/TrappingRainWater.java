package Hard;

public class TrappingRainWater {
	public int trap(int[] height) {
		int n = height.length;

		int[] prefix = new int[n];  // 1, 5, 5, 5, 5
		int[] suffix = new int[n];  //

		prefix[0] = height[0];
		for (int i = 1; i < n; i++) {
			prefix[i] = Math.max(prefix[i - 1], height[i]);
		}

		suffix[n - 1] = height[n - 1];
		for (int i = n - 2; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i + 1], height[i]);
		}

		int result = 0;

		for (int i = 1; i < n-1; i++) {
			result += Math.min(prefix[i], suffix[i]) - height[i];
		}

		return result;
	}
}
