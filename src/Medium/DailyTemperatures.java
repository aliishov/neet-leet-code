package Medium;

import java.util.Stack;

public class DailyTemperatures {
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] res = new int[n];
		Stack<int[]> st = new Stack<>();

		for (int i = 0; i < n; i++) {
			int t = temperatures[i];
			while (!st.isEmpty() && t > st.peek()[0]) {
				int[] pair = st.pop();
				res[pair[1]] = i - pair[1];
			}
			st.push(new int[] {t, i});
		}

		return res;
	}
}
