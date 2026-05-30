package Medium;

import java.util.Arrays;

public class CarFleet {
	public int carFleet(int target, int[] position, int[] speed) {
		int[][] pairs = new int[position.length][2];
		for (int i = 0; i < position.length; i++) {
			pairs[i][0] = position[i];
			pairs[i][1] = speed[i];
		}

		Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));

		double lastTime = 0;
		int fleet = 0;

		for (int[] p : pairs) {
			double time = (double) (target - p[0]) / p[1];

			if (time > lastTime) {
				fleet++;
				lastTime = time;
			}
		}

		return fleet;
	}
}
