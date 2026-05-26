package Medium;

public class Searcha2DMatrix {
	public boolean searchMatrix(int[][] matrix, int target) {
		int n = matrix.length;
		int m = matrix[0].length;

		int left = 0;
		int right = n * m - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midValue = matrix[mid / m][mid % m];

			if (midValue == target) {
				return true;
			} else if (midValue < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return false;
	}
}
