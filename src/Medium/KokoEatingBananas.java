package Medium;

public class KokoEatingBananas {
	public int minEatingSpeed(int[] piles, int h) {
		int left = 1;
		int right = getMax(piles);

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (canEatAllBananas(piles, mid, h)) right = mid - 1;
			else left = mid + 1;
		}

		return left;
	}

	private int getMax(int[] piles) {
		int max = Integer.MIN_VALUE;
		for (int p : piles) {
			if (max < p) max = p;
		}

		return max;
	}

	private boolean canEatAllBananas(int[] piles, int k, int h) {
		int hoursNeeded = 0;
		for (int pile : piles) {
			hoursNeeded += (pile + k - 1) / k;
		}
		return hoursNeeded <= h;
	}
}
